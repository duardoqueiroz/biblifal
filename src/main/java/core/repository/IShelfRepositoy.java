package core.repository;

import java.util.ArrayList;

import core.entities.Shelf;

public interface IShelfRepositoy {
  void save(Shelf shelf);

  void remove(int shelfId);

  ArrayList<Shelf> findAll();

  Shelf find(int shelfId);
}
