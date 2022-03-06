package core.entities;

public class Genre {
  private int id;
  private String name;

  public Genre(int id, String name) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Genre [id=" + id + ", name=" + name + "]";
  }
}
