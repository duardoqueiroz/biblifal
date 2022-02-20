package core.services;

import java.util.ArrayList;

import core.entities.Shelf;
import core.repository.IShelfRepository;

public class ShelfsService {
  private IShelfRepository shelfRepositoy;

  public ShelfsService(IShelfRepository shelfRepository) {
    this.shelfRepositoy = shelfRepository;
  }

  public void save(Shelf shelf) {
    this.shelfRepositoy.save(shelf);
  }

  public Shelf find(int shelfId) {
    Shelf shelf = this.shelfRepositoy.find(shelfId);
    return shelf;
  }

  public ArrayList<Shelf> findAll() {
    ArrayList<Shelf> shelfs = this.shelfRepositoy.findAll();
    return shelfs;
  }

  public void remove(int shelfId) {
    this.shelfRepositoy.remove(shelfId);
  }

}
