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
            String sql = "INSERT INTO books(id, title, publishing_company, author, price); VALUES(DEFAULT, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, book.getTitle());
            pst.setString(2, book.getCompany());
            pst.setString(3, book.getAuthor());
            pst.execute();

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

            while (rst.next()){
                int id = rst.getInt("id");
                String title = rst.getString("title");
                String company = rst.getString("publishing_company");
                String author = rst.getString("author");
                Float price = rst.getFloat("price");
                Genre[] genres = {new Genre("genre123")};//TODO 
                book = new Book(id, title, company,author, price, genres);//TODO
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
        try{
            Connection conn = Postgres.getConnection();
            String sql = "SELECT * FROM books;";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while(rst.next()) {
                int id = rst.getInt("id");
                String title = rst.getString("title");
                String company = rst.getString("publishing_company");
                String author = rst.getString("author");
                float price = rst.getFloat("price");
                Genre[] genres = {new Genre("genre123")};//TODO 
                Book book = new Book(id, title, company,author, price, genres);//TODO
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
        
    }


   
    
}
