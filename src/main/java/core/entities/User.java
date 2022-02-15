package core.entities;

public class User {
  private String name;
  private Boolean isManager = false;
  private Email email;

  public User(String name, Boolean isManager, Email email) {
    this.name = name;
    this.isManager = isManager;
    this.email = email;
  }

  @Override
  public String toString() {
    return "User [email=" + email + ", isManager=" + isManager + ", name=" + name + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getIsManager() {
    return isManager;
  }

  public void setIsManager(Boolean isManager) {
    this.isManager = isManager;
  }

  public Email getEmail() {
    return email;
  }

  public void setEmail(Email email) {
    this.email = email;
  }
}
