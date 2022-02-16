package core.repository;

import java.util.ArrayList;

import core.entities.Section;

public interface ISection {
  void save(Section section);

  void remove(int sectionID);

  Section find(int sectionId);

  ArrayList<Section> findAll();
}
