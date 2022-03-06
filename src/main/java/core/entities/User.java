package core.entities;

public class User {
  private int id;
  private String name, password;
  private Boolean isManager = false;
  private String email;

  public User(int id, String name, String email, String password, boolean isManager) {
    if ((email.isEmpty() || email.contains(" ")) || (name.isEmpty())
        || (password.isEmpty() || password.contains(" "))) {
      return;
    }

    if (!email
        .matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-zA-Z]{2,})$")) {
      return;
    }
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.isManager = isManager;
  }

  @Override
  public String toString() {
    return "User [email=" + email + ", isManager=" + isManager + ", name=" + name + "]";
  }

  public String getName() {
    return name;
  }

  public Boolean getIsManager() {
    return isManager;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public int getId() {
    return id;
  }

}
