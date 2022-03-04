package infra.controllers;

import java.util.ArrayList;

import core.entities.Genre;
import core.services.GenresService;
import infra.postgresRepository.GenreRepository;

public class GenresController {
  private GenreRepository genreRepository;
  private GenresService genresService;

  public GenresController() {
    this.genreRepository = new GenreRepository();
    this.genresService = new GenresService(genreRepository);
  }

  public void save(Genre genre) {
    this.genresService.save(genre);

  }

  public void remove(int genreId) {
    this.genresService.remove(genreId);

  }

  public Genre find(int genreId) {
    return this.genresService.find(genreId);
  }

  public ArrayList<Genre> findAll() {
    ArrayList<Genre> genres = this.genresService.findAll();
    return genres;
  }
}
