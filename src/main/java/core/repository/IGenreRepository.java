package core.repository;

import java.util.ArrayList;
import core.entities.Genre;

public interface IGenreRepository {
  void save(Genre genre);

  void remove(int genreId);

  ArrayList<Genre> findAll();

  Genre find(int genreId);
}