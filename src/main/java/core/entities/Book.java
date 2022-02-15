package core.entities;

public class Book {
  private String title;
  private String company;
  private String author;
  private float price;
  private Shelf shelf;

  public Book(String title, String company, String author, float price, Shelf shelf) {
    this.title = title;
    this.company = company;
    this.author = author;
    this.price = price;
    this.shelf = shelf;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public Shelf getShelf() {
    return shelf;
  }

  public void setShelf(Shelf shelf) {
    this.shelf = shelf;
  }

  @Override
  public String toString() {
    return "Book [author=" + author + ", company=" + company + ", price=" + price + ", shelf=" + shelf + ", title="
        + title + "]";
  }
}
