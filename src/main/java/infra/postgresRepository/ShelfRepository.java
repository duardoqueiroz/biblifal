package infra.postgresRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import core.entities.Section;
import core.entities.Shelf;
import core.repository.IShelfRepository;
import database.Postgres;

public class ShelfRepository implements IShelfRepository {

  @Override
  public void save(Shelf shelf) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "INSERT INTO shelfs(id,section_id,capacity) VALUES(DEFAULT,?,?);";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelf.getSection().getId());
      pst.setInt(2, shelf.getCapacity());
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public void remove(int shelfId) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "DELETE FROM shelfs WHERE id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelfId);
      pst.execute();

      pst.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public ArrayList<Shelf> findAll() {
    ArrayList<Shelf> shelfs = new ArrayList<>();
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT shelfs.id,shelfs.section_id,shelfs.capacity,sections.name,sections.description FROM shelfs INNER JOIN sections ON sections.id = shelfs.section_id;";
      PreparedStatement pst = conn.prepareStatement(sql);
      ResultSet rst = pst.executeQuery();
      while (rst.next()) {
        int id = rst.getInt("id");
        int sectionId = rst.getInt("section_id");
        int capacity = rst.getInt("capacity");
        String name = rst.getString("name");
        String description = rst.getString("description");
        Shelf shelf = new Shelf(new Section(sectionId, name, description), capacity, id);
        shelfs.add(shelf);
      }
      pst.close();
      conn.close();
      rst.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return shelfs;
  }

  @Override
  public Shelf find(int shelfId) {
    Shelf shelf = null;
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT shelfs.id,shelfs.section_id,shelfs.capacity,sections.name,sections.description FROM shelfs INNER JOIN sections ON sections.id = shelfs.section_id WHERE shelfs.id = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setInt(1, shelfId);
      ResultSet rst = pst.executeQuery();

      while (rst.next()) {
        int id = rst.getInt("id");
        int sectionId = rst.getInt("section_id");
        int capacity = rst.getInt("capacity");
        String name = rst.getString("name");
        String description = rst.getString("description");
        shelf = new Shelf(new Section(sectionId, name, description), capacity, id);
      }

      pst.close();
      conn.close();
      rst.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return shelf;
  }

}
