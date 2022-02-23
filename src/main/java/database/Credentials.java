package database;

import io.github.cdimascio.dotenv.Dotenv;

public final class Credentials {
  private String port, dbname, host, username, password;
  private static Credentials instance;

  public Credentials() {
    Dotenv dotenv = Dotenv.configure().load();
    this.port = dotenv.get("PG_PORT");
    this.host = dotenv.get("PG_HOST");
    this.dbname = dotenv.get("PG_DB_NAME");
    this.username = dotenv.get("PG_USER");
    this.password = dotenv.get("PG_PASSWORD");
  }

  public static Credentials getInstance() {
    if (instance == null) {
      instance = new Credentials();
    }
    return instance;
  }

  public String getPort() {
    return port;
  }

  public String getDbname() {
    return dbname;
  }

  public String getHost() {
    return host;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

}
