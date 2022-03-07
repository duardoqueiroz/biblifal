package core.repository;

import java.util.ArrayList;

import core.entities.Section;
import core.entities.Shelf;

public interface ISectionRepository {
  void save(Section section);

  void remove(int sectionId);

  Section find(int sectionId);

  ArrayList<Section> findAll();

  ArrayList<Shelf> findShelfs(int sectionId);

  Shelf findShelf(int sectionId, int shelfId);

  void removeShelf(int sectionId, int shelfId);
}
