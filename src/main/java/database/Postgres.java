package database;

import java.sql.*;

public class Postgres {
  public static Connection getConnection(String username, String password, String dbname, String host, String port) {
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://" + host + ":" + port + "/" + dbname;

    try {
      Class.forName(driver);
      return DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    throw new IllegalArgumentException("Erro ao conectar com banco de dados!");
  }
}
