package core.repository;

import java.util.ArrayList;

import core.entities.Shelf;

public interface IShelfRepository {
  void save(Shelf shelf);

  void remove(int shelfId);

  ArrayList<Shelf> findAll();

  Shelf find(int shelfId);
}
