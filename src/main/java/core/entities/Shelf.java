package core.entities;

public class Shelf {
  private Section section;
  private int capacity;

  public Shelf(Section section, int capacity) {
    this.section = section;
    this.capacity = capacity;
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
    return "Shelf [capacity=" + capacity + ", section=" + section + "]";
  }

}
