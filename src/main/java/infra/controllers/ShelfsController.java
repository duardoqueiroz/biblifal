package infra.controllers;

import java.util.ArrayList;

import core.entities.Book;
import core.entities.Shelf;
import core.entities.ShelfBooks;
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

  public ArrayList<ShelfBooks> findBooks(int shelfId) {
    ArrayList<ShelfBooks> shelfBooks = this.shelfsService.findBooks(shelfId);
    return shelfBooks;
  }

  public boolean sellBook(int bookId, int shelfId, int quantity) {
    boolean aprovved = this.shelfsService.sellBook(bookId, shelfId, quantity);
    return aprovved;
  }

  public void removeBook(int shelfId, int bookId) {
    this.shelfsService.removeBook(shelfId, bookId);
  }

  public boolean insertBook(int shelfId, int bookId, int quantity) {
    boolean approved = this.shelfsService.insertBook(shelfId, bookId, quantity);
    return approved;
  }

}
