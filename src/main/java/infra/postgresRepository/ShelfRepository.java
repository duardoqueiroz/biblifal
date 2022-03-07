package infra.postgresRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sound.sampled.Port;

import core.entities.Book;
import core.entities.Genre;
import core.entities.Section;
import core.entities.Shelf;
import core.entities.ShelfBooks;
import core.repository.IShelfRepository;
import database.Postgres;

public class ShelfRepository implements IShelfRepository {

  @Override
  public void save(Shelf shelf) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "INSERT INTO shelfs(id,section_id,capacity) VALUES(DEFAULT,?,?);";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelf.getSection().getId());
      pst.setInt(2, shelf.getCapacity());
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public void remove(int shelfId) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "DELETE FROM shelfs WHERE id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelfId);
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public ArrayList<Shelf> findAll() {
    ArrayList<Shelf> shelfs = new ArrayList<>();
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT shelfs.id,shelfs.section_id,shelfs.capacity,sections.name,sections.description FROM shelfs INNER JOIN sections ON sections.id = shelfs.section_id;";
      PreparedStatement pst = conn.prepareStatement(sql);
      ResultSet rst = pst.executeQuery();
      while (rst.next()) {
        int id = rst.getInt("id");
        int sectionId = rst.getInt("section_id");
        int capacity = rst.getInt("capacity");
        String name = rst.getString("name");
        String description = rst.getString("description");
        Shelf shelf = new Shelf(new Section(sectionId, name, description), capacity, id);
        shelfs.add(shelf);
      }
      pst.close();
      conn.close();
      rst.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return shelfs;
  }

  @Override
  public Shelf find(int shelfId) {
    Shelf shelf = null;
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT shelfs.id,shelfs.section_id,shelfs.capacity,sections.name,sections.description FROM shelfs INNER JOIN sections ON sections.id = shelfs.section_id WHERE shelfs.id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelfId);
      ResultSet rst = pst.executeQuery();

      while (rst.next()) {
        int id = rst.getInt("id");
        int sectionId = rst.getInt("section_id");
        int capacity = rst.getInt("capacity");
        String name = rst.getString("name");
        String description = rst.getString("description");
        shelf = new Shelf(new Section(sectionId, name, description), capacity, id);
      }

      pst.close();
      conn.close();
      rst.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return shelf;
  }

  @Override
  public ArrayList<ShelfBooks> findBooks(int shelfId) {
    ArrayList<ShelfBooks> shelfBooks = new ArrayList<>();

    try {
      Connection conn = Postgres.getConnection();

      String sql = "select b.id as book_id,b.title as title,b.author as author,b.publishing_company as company,b.price as price,s.capacity as capacity,sb.id as shelf_books_id,sb.quantity as quantity,s2.id as section_id,s2.name as name,s2.description as description from books b inner join shelf_books sb on sb.book_id = b.id inner join shelfs s on s.id = sb.shelf_id inner join sections s2 on s2.id =s.section_id where s.id = ?;";

      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelfId);
      ResultSet rst = pst.executeQuery();

      int quantity = 0;
      while (rst.next()) {
        int bookId = rst.getInt("book_id");
        int sectionId = rst.getInt("section_id");
        int shelfBooksId = rst.getInt("shelf_books_id");
        String title = rst.getString("title");
        String company = rst.getString("company");
        String author = rst.getString("author");
        float price = rst.getFloat("price");
        quantity = rst.getInt("quantity");
        int capacity = rst.getInt("capacity");
        String name = rst.getString("name");
        String description = rst.getString("description");
        Genre[] genres = new Genre[3];

        sql = "SELECT * FROM genres INNER JOIN book_genres ON book_genres.genre_id = genres.id INNER JOIN books ON book_genres.book_id = books.id WHERE books.id = ?;";
        pst = conn.prepareStatement(sql);
        pst.setInt(1, bookId);
        ResultSet rst2 = pst.executeQuery();

        int i = 0;
        while (rst2.next()) {
          int genreId = rst2.getInt("id");
          String genreName = rst2.getString("name");
          genres[i] = new Genre(genreId, genreName);
          i++;
        }

        rst2.close();
        Shelf shelf = new Shelf(new Section(sectionId, name, description), capacity, shelfId);
        Book book = new Book(bookId, title, company, author, price, genres);
        ShelfBooks shelfBook = new ShelfBooks(shelfBooksId, shelf, book, quantity);

        shelfBooks.add(shelfBook);
      }

      pst.close();
      conn.close();
      rst.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return shelfBooks;
  }

  @Override
  public void sellBook(int bookId, int shelfId, int quantity) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "UPDATE shelf_books SET quantity = quantity - ? WHERE book_id = ? AND shelf_id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, quantity);
      pst.setInt(2, bookId);
      pst.setInt(3, shelfId);
      pst.executeUpdate();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void removeBook(int shelfId, int bookId) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "DELETE FROM shelf_books WHERE shelf_id = ? AND book_id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelfId);
      pst.setInt(2, bookId);
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public ShelfBooks findBook(int shelfId, int bookId) {
    ShelfBooks shelfBook = null;
    try {
      Connection conn = Postgres.getConnection();
      String sql = "select b.title as title,b.author as author,b.publishing_company as company,b.price as price,s.capacity as capacity,sb.id as shelf_books_id,sb.quantity as quantity,s2.id as section_id,s2.name as name,s2.description as description from books b inner join shelf_books sb on sb.book_id = b.id inner join shelfs s on s.id = sb.shelf_id inner join sections s2 on s2.id =s.section_id where b.id = ? AND s.id =?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, bookId);
      pst.setInt(2, shelfId);

      ResultSet rst = pst.executeQuery();

      int quantity = 0;
      while (rst.next()) {
        int sectionId = rst.getInt("section_id");
        int shelfBooksId = rst.getInt("shelf_books_id");
        String title = rst.getString("title");
        String company = rst.getString("company");
        String author = rst.getString("author");
        float price = rst.getFloat("price");
        quantity = rst.getInt("quantity");
        int capacity = rst.getInt("capacity");
        String name = rst.getString("name");
        String description = rst.getString("description");
        Genre[] genres = new Genre[3];

        sql = "SELECT * FROM genres INNER JOIN book_genres ON book_genres.genre_id = genres.id INNER JOIN books ON book_genres.book_id = books.id WHERE books.id = ?;";
        pst = conn.prepareStatement(sql);
        pst.setInt(1, bookId);
        ResultSet rst2 = pst.executeQuery();

        int i = 0;
        while (rst2.next()) {
          int genreId = rst2.getInt("id");
          String genreName = rst2.getString("name");
          genres[i] = new Genre(genreId, genreName);
          i++;
        }

        rst2.close();
        Shelf shelf = new Shelf(new Section(sectionId, name, description), capacity, shelfId);
        Book book = new Book(bookId, title, company, author, price, genres);
        shelfBook = new ShelfBooks(shelfBooksId, shelf, book, quantity);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return shelfBook;
  }

  @Override
  public void insertBook(int shelfId, int bookId, int quantity) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "INSERT INTO shelf_books(id,shelf_id,book_id,quantity) VALUES(DEFAULT,?,?,?);";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelfId);
      pst.setInt(2, bookId);
      pst.setInt(3, quantity);
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
