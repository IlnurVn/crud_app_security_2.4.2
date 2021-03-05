package vish.dao;

import vish.model.User;

import java.util.List;

public interface UserDao {

    int usersCount();

    List<User> allUsers(int page);

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(int id);

    User getUserByName(String name);
}
