package core.services;

import java.util.ArrayList;

import core.Cryptography;
import core.entities.User;
import core.repository.IUserRepository;

public class UsersService {
  private IUserRepository userRepository;

  public UsersService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void save(User user) {
    User alreadyExists = this.userRepository.find(user.getEmail());
    if (alreadyExists != null) {
      return;
    }
    this.userRepository.save(user);
  }

  public User find(String email) {
    User user = this.userRepository.find(email);
    return user;
  }

  public ArrayList<User> findAll() {
    ArrayList<User> users = this.userRepository.findAll();
    return users;
  }

  public User authenticate(String email, String password) {
    User user = this.userRepository.find(email);
    if (user != null) {
      if (Cryptography.encrypt(password).equals(user.getPassword())) {
        return user;
      }
    }
    return null;
  }
}
