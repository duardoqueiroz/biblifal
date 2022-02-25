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

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }
}
