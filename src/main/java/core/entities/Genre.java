package core.entities;

public class Genre {
  private String name;
  private int id;

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
