package core.entities;

import java.util.Arrays;

public class Book {
  private int id;
  private String title;
  private String company;
  private Genre[] genres = new Genre[3];
  private String author;
  private float price;

  public Book(int id, String title, String company, String author, float price, Genre[] genres) {
    this.id = id;
    this.title = title;
    this.company = company;
    this.author = author;
    this.price = price;
    this.genres = genres;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
      this.id = id;
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

  @Override
  public String toString() {
    return "Book [id = "+ id +"author=" + author + ", company=" + company + ", genres=" + Arrays.toString(genres) + ", price="
        + price + ", title=" + title + "]";
  }

  public Genre[] getGenres() {
    return genres;
  }

  public void setGenres(Genre[] genres) {
    this.genres = genres;
  }
}
