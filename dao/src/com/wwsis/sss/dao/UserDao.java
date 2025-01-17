package com.wwsis.sss.dao;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(int userId);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
}