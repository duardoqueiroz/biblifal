package core.services;

import java.util.ArrayList;

import core.entities.Genre;
import core.repository.IGenreRepository;

public class GenresService {
  private IGenreRepository genreRepository;

  public GenresService(IGenreRepository genreRepository) {
    this.genreRepository = genreRepository;
  }

  public void save(Genre genre) {
    genreRepository.save(genre);
  }

  public void remove(int genreId) {
    Genre doesNotExists = this.genreRepository.find(genreId);
    if (doesNotExists == null) {
      return;
    }
    genreRepository.remove(genreId);
  }

  public Genre find(int genreId) {
    return this.genreRepository.find(genreId);
  }

  public ArrayList<Genre> findAll() {
    ArrayList<Genre> genres = this.genreRepository.findAll();
    return genres;
  }
}
