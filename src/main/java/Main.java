import database.Postgres;
import io.github.cdimascio.dotenv.Dotenv;

public class Main {
  public static void main(String[] args) {
    Dotenv dotenv = Dotenv.configure().load();
    String port = dotenv.get("PG_PORT");
    String host = dotenv.get("PG_HOST");
    String password = dotenv.get("PG_PASSWORD");
    String dbname = dotenv.get("PG_DB_NAME");
    String username = dotenv.get("PG_USER");
    Postgres.getConnection(username, password, dbname, host, port);
  }
}