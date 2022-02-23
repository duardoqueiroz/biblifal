package core.repository;

import java.util.ArrayList;

import core.entities.Section;

public interface ISectionRepository {
  void save(Section section);

  void remove(int sectionId);

  Section find(int sectionId);

  ArrayList<Section> findAll();
}
