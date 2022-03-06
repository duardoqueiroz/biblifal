package core.entities;

public class ShelfBooks {
  private int id;
  private Shelf shelf;
  private Book book;
  private int booksQuantity;

  public ShelfBooks(int id, Shelf shelf, Book book, int booksQuantity) {
    this.id = id;
    this.shelf = shelf;
    this.book = book;
    this.booksQuantity = booksQuantity;
  }

  public Shelf getShelf() {
    return shelf;
  }

  public int getBooksQuantity() {
    return booksQuantity;
  }

  public Book getBook() {
    return book;
  }

  public int getId() {
    return id;
  }

}
