package infra.controllers;

import java.util.ArrayList;

import core.entities.*;
import core.services.UsersService;
import infra.postgresRepository.UserRepository;

public class UsersController {
  private UserRepository userRepository;
  private UsersService userService;

  public UsersController() {
    this.userRepository = new UserRepository();
    this.userService = new UsersService(userRepository);
  }

  public void save(User user) {
    this.userService.save(user);
  }

  public User find(String email) {
    User user = this.userService.find(email);
    return user;
  }

  public ArrayList<User> findAll() {
    ArrayList<User> users = this.userService.findAll();
    return users;
  }

  public User authenticate(String email, String password) {
    User user = this.userService.authenticate(email, password);
    return user;
  }
}
