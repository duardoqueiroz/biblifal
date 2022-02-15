package core.entities;

public class Email {
  private String code;

  public Email(String code) {
    if (code.matches("/^([a-z]){1,}([a-z0-9._-]){1,}([@]){1}([a-z]){2,}([.]){1}([a-z]){2,}([.]?){1}([a-z]?){2,}$/i")) {
      this.code = code;
    }
  }

}
