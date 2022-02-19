package core.entities;

public class User {
  private int id;
  private String name, password;
  private Boolean isManager = false;
  private String email;

  public User(String name, String email, String password) {
    if ((email.isEmpty() || email.contains(" ")) || (name.isEmpty())
        || (password.isEmpty() || password.contains(" "))) {
      return;
    }

    if (!email
        .matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-zA-Z]{2,})$")) {
      return;
    }

    this.name = name;
    this.email = email;
    this.password = password;
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

  public void setIsManager(Boolean isManager) {
    this.isManager = isManager;
  }

  public void setId(int id) {
    this.id = id;
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
