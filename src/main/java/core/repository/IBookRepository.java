package core.repository;

import java.util.ArrayList;

import core.entities.Book;

public interface IBookRepository {
  void remove(int bookId);

  void save(Book book);

  ArrayList<Book> findAll();

  void update(int bookId);
}
