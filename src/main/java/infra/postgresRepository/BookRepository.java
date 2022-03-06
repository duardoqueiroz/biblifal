package infra.postgresRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import core.entities.Book;
import core.entities.Genre;
import core.repository.IBookRepository;
import database.Postgres;

public class BookRepository implements IBookRepository {

    @Override
    public void save(Book book) {
        try {
            Connection conn = Postgres.getConnection();
            String sql = "INSERT INTO books(id, title, publishing_company, author, price) VALUES(DEFAULT, ?, ?, ?, ?) RETURNING ID;";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, book.getTitle());
            pst.setString(2, book.getCompany());
            pst.setString(3, book.getAuthor());
            pst.setFloat(4, book.getPrice());
            pst.execute();

            ResultSet lastBook = pst.getResultSet();
            int lastBookId = -1;
            if (lastBook.next()) {
                lastBookId = lastBook.getInt("id");
            }

            for (int i = 0; i < book.getGenres().length; i++) {
                if (book.getGenres()[i] != null) {
                    sql = "INSERT INTO book_genres(id, book_id, genre_id) VALUES(DEFAULT, ?, ?);";
                    pst = conn.prepareStatement(sql);

                    pst.setInt(1, lastBookId);
                    pst.setInt(2, book.getGenres()[i].getId());
                    pst.execute();
                }
            }

            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int bookId) {
        try {
            Connection conn = Postgres.getConnection();
            String sql = "DELETE FROM books WHERE id = ?;";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.execute();

            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Book find(int bookId) {
        Book book = null;
        try {
            Connection conn = Postgres.getConnection();
            String sql = "SELECT * FROM books WHERE id = ?;";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, bookId);
            ResultSet rst = pst.executeQuery();

            while (rst.next()) {

                int id = rst.getInt("id");
                String title = rst.getString("title");
                String company = rst.getString("publishing_company");
                String author = rst.getString("author");
                Float price = rst.getFloat("price");
                sql = "SELECT * FROM genres INNER JOIN book_genres ON book_genres.genre_id = genres.id INNER JOIN books ON book_genres.book_id = books.id WHERE books.id = ?;";
                pst = conn.prepareStatement(sql);
                pst.setInt(1, bookId);
                ResultSet rst2 = pst.executeQuery();
                Genre[] genres = new Genre[3];
                int i = 0;
                while (rst2.next()) {
                    int genreId = rst2.getInt("id");
                    String genreName = rst2.getString("name");
                    genres[i] = new Genre(genreId, genreName);
                    i++;
                }
                book = new Book(id, title, company, author, price, genres);
                rst2.close();
            }
            conn.close();
            pst.close();
            rst.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public ArrayList<Book> findAll() {
        ArrayList<Book> books = new ArrayList<>();
        try {
            Connection conn = Postgres.getConnection();
            String sql = "SELECT * FROM books;";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                int id = rst.getInt("id");
                String title = rst.getString("title");
                String company = rst.getString("publishing_company");
                String author = rst.getString("author");
                float price = rst.getFloat("price");
                sql = "SELECT * FROM genres INNER JOIN book_genres ON book_genres.genre_id = genres.id INNER JOIN books ON book_genres.book_id = books.id WHERE books.id = ?;";
                pst = conn.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rst2 = pst.executeQuery();
                Genre[] genres = new Genre[3];
                int i = 0;
                while (rst2.next()) {
                    int genreId = rst2.getInt("id");
                    String genreName = rst2.getString("name");
                    genres[i] = new Genre(genreId, genreName);
                    i++;
                }
                rst2.close();
                Book book = new Book(id, title, company, author, price, genres);
                books.add(book);
            }
            conn.close();
            pst.close();
            rst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }

    @Override
    public void update(Book editBook, int bookId) {
        try {
            Connection conn = Postgres.getConnection();
            String sql = "UPDATE books SET title = ?, publishing_company = ?, author = ?, price = ? WHERE id = ?;";
            PreparedStatement pst = conn.prepareStatement(sql);
            // pst.setString();
            pst.setString(1, editBook.getTitle());
            pst.setString(2, editBook.getCompany());
            pst.setString(3, editBook.getAuthor());
            pst.setFloat(4, editBook.getPrice());
            pst.setInt(5, bookId);
            pst.executeUpdate();

            sql = "DELETE FROM book_genres WHERE book_id = ?;";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, bookId);
            pst.execute();

            for (int i = 0; i < editBook.getGenres().length; i++) {
                if (editBook.getGenres()[i] != null) {
                    sql = "INSERT INTO book_genres(id,book_id,genre_id) VALUES(DEFAULT,?,?);";
                    pst = conn.prepareStatement(sql);
                    pst.setInt(1, bookId);
                    pst.setInt(2, editBook.getGenres()[i].getId());
                    pst.executeUpdate();
                }
            }

            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
