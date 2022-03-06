package core.repository;

import java.util.ArrayList;

import core.entities.Shelf;
import core.entities.ShelfBooks;

public interface IShelfRepository {
  void save(Shelf shelf);

  void remove(int shelfId);

  ArrayList<Shelf> findAll();

  Shelf find(int shelfId);

  ArrayList<ShelfBooks> findBooks(int shelfId);

  void sellBook(int bookId, int shelfId, int quantity);

  void removeBook(int shelfId, int bookId);

  ShelfBooks findBook(int shelfId, int bookId);

  void insertBook(int shelfId, int bookId, int quantity);

}
