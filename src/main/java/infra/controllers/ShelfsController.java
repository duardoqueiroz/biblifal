package infra.controllers;

import java.util.ArrayList;

import core.entities.Shelf;
import core.services.ShelfsService;
import infra.postgresRepository.ShelfRepository;

public class ShelfsController {
  private ShelfRepository shelfRepository;
  private ShelfsService shelfsService;

  public ShelfsController() {
    this.shelfRepository = new ShelfRepository();
    this.shelfsService = new ShelfsService(shelfRepository);
  }

  public void save(Shelf shelf) {
    this.shelfsService.save(shelf);
  }

  public Shelf find(int shelfId) {
    Shelf shelf = this.shelfsService.find(shelfId);
    return shelf;
  }

  public ArrayList<Shelf> findAll() {
    ArrayList<Shelf> shelfs = this.shelfsService.findAll();
    return shelfs;
  }

  public void remove(int shelfId) {
    this.shelfsService.remove(shelfId);
  }

}
