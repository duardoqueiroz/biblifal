package core.entities;

public class Section {
  private int id;
  private String name;
  private String description;

  public Section(int id, String name, String description) {
    this.name = name;
    this.description = description;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "Section [Id=" + id + ", description=" + description + ", name=" + name + "]";
  }

  public int getId() {
    return id;
  }

}
