package core.entities;

public class Section {
  private int id;
  private String name;
  private String description;

  public Section(String name, String description) {
    this.name = name;
    this.description = description;
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

  public void setDescription(String description) {
    this.description = description;
  }

  public int getId(){
    return id;
  }

  @Override
  public String toString() {
    return "Section [Id="+ id + ", description=" + description + ", name=" + name + "]";
  }
}
