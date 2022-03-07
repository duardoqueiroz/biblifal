package core.services;

import java.util.ArrayList;

import core.entities.Shelf;
import core.entities.ShelfBooks;
import core.repository.IShelfRepository;

public class ShelfsService {
  private IShelfRepository shelfRepositoy;

  public ShelfsService(IShelfRepository shelfRepository) {
    this.shelfRepositoy = shelfRepository;
  }

  public void save(Shelf shelf) {
    this.shelfRepositoy.save(shelf);
  }

  public Shelf find(int shelfId) {
    Shelf shelf = this.shelfRepositoy.find(shelfId);
    return shelf;
  }

  public ArrayList<Shelf> findAll() {
    ArrayList<Shelf> shelfs = this.shelfRepositoy.findAll();
    return shelfs;
  }

  public void remove(int shelfId) {
    this.shelfRepositoy.remove(shelfId);
  }

  public ArrayList<ShelfBooks> findBooks(int shelfId) {
    Shelf shelf = this.shelfRepositoy.find(shelfId);
    if (shelf == null) {
      return null;
    }
    ArrayList<ShelfBooks> shelfBooks = this.shelfRepositoy.findBooks(shelfId);
    return shelfBooks;
  }

  public boolean sellBook(int bookId, int shelfId, int quantity) {
    ShelfBooks shelfBook = this.shelfRepositoy.findBook(shelfId, bookId);
    if (shelfBook == null) {
      System.out.println("cehgou");
      return false;
    }

    if (shelfBook.getBooksQuantity() < quantity) {
      System.out.println(shelfBook.getBooksQuantity() < quantity);
      return false;
    }

    this.shelfRepositoy.sellBook(bookId, shelfId, quantity);
    return true;
  }

  public void removeBook(int shelfId, int bookId) {
    ShelfBooks shelfBook = this.shelfRepositoy.findBook(shelfId, bookId);
    if (shelfBook == null) {
      return;
    }
    this.shelfRepositoy.removeBook(shelfId, bookId);
  }

  public boolean insertBook(int shelfId, int bookId, int quantity) {
    Shelf shelf = this.shelfRepositoy.find(shelfId);

    if (shelf == null) {
      return false;
    }
    ShelfBooks shelfBook = this.shelfRepositoy.findBook(shelfId, bookId);
    if (shelfBook != null) {
      return false;
    }
    int totalBooks = 0;
    for (ShelfBooks book : this.shelfRepositoy.findBooks(shelfId)) {
      totalBooks += book.getBooksQuantity();
    }

    if (quantity > shelf.getCapacity() - totalBooks) {
      return false;
    }

    this.shelfRepositoy.insertBook(shelfId, bookId, quantity);
    return true;
  }

}
