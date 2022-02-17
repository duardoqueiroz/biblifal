package infra.postgresRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import core.Cryptography;
import core.entities.User;
import core.repository.IUserRepository;
import database.Postgres;

public class UserRepository implements IUserRepository {

  @Override
  public void save(User user) {
    try {
      Connection conn = Postgres.getConnection();
      String sql = "INSERT INTO users(id,name,email,password,is_manager) VALUES(DEFAULT,?,?,?,FALSE);";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setString(1, user.getName());
      pst.setString(2, user.getEmail());
      pst.setString(3, Cryptography.encrypt(user.getPassword()));
      pst.execute();

      pst.close();
      conn.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public ArrayList<User> findAll() {
    ArrayList<User> users = new ArrayList<>();
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT * FROM users;";
      PreparedStatement pst = conn.prepareStatement(sql);
      ResultSet rst = pst.executeQuery();
      while (rst.next()) {
        int id = rst.getInt("id");
        String name = rst.getString("name");
        String email = rst.getString("email");
        String password = rst.getString("password");
        boolean isManager = rst.getBoolean("is_manager");
        User user = new User(name, email, password);
        user.setIsManager(isManager);
        user.setId(id);
        users.add(user);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return users;
  }

  @Override
  public User find(String email) {
    User user = null;
    try {
      Connection conn = Postgres.getConnection();
      String sql = "SELECT * FROM users WHERE email = ?;";
      PreparedStatement pst = conn.prepareStatement(sql);
      pst.setString(1, email);
      ResultSet rst = pst.executeQuery();

      while (rst.next()) {
        int id = rst.getInt("id");
        String name = rst.getString("name");
        String password = rst.getString("password");
        boolean isManager = rst.getBoolean("is_manager");
        user = new User(name, email, password);
        user.setIsManager(isManager);
        user.setId(id);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return user;
  }

}
