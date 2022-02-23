package core.entities;

public class Shelf {
  private Section section;
  private int capacity, id;

  public Shelf(Section section, int capacity, int id) {
    this.section = section;
    this.capacity = capacity;
    this.id = id;
  }

  public Section getSection() {
    return section;
  }

  public void setSection(Section section) {
    this.section = section;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Shelf [capacity=" + capacity + ", id=" + id + ", section=" + section + "]";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
