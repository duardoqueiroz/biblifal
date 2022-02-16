package core.repository;

import java.util.ArrayList;

import core.entities.User;

public interface IUserRepository {
  void save(User user);

  ArrayList<User> findAll();
}
