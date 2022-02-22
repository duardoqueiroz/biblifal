package core.repository;

import java.util.ArrayList;

import core.entities.Book;

public interface IBookRepository {

  void save(Book book);

  void remove(int bookId);

  Book find(int bookId);

  ArrayList<Book> findAll();

  void update(int bookId);
}
