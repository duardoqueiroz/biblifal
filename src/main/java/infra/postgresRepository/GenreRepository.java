package infra.postgresRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import core.entities.Genre;
import core.repository.IGenreRepository;
import database.Postgres;

public class GenreRepository implements IGenreRepository {

  @Override
  public void save(Genre genre) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "INSERT INTO genres(id,name) VALUES(DEFAULT,?);";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setString(1, genre.getName());
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public void remove(int genreId) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "DELETE FROM genres WHERE id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, genreId);
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public ArrayList<Genre> findAll() {
    ArrayList<Genre> genres = new ArrayList<>();
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT * FROM genres;";
      PreparedStatement pst = conn.prepareStatement(sql);
      ResultSet rst = pst.executeQuery();

      while (rst.next()) {
        int id = rst.getInt("id");
        String name = rst.getString("name");
        genres.add(new Genre(id, name));
      }
      pst.close();
      rst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public Genre find(int genreId) {
    Genre genre = null;
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT * FROM genres WHERE id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, genreId);
      ResultSet rst = pst.executeQuery();

      if (rst.next()) {
        int id = rst.getInt("id");
        String name = rst.getString("name");
        genre = new Genre(id, name);
      }

      pst.close();
      rst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return genre;
  }

}
