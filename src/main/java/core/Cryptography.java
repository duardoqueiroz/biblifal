package core;

import java.security.MessageDigest;

public class Cryptography {
  public static String encrypt(String password) {
    try {
      MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
      byte messageDigestPassword[] = algorithm.digest(password.getBytes("UTF-8"));

      StringBuilder hexStringPassword = new StringBuilder();
      for (byte b : messageDigestPassword) {
        hexStringPassword.append(String.format("%02X", 0xFF & b));
      }
      return hexStringPassword.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }
}
