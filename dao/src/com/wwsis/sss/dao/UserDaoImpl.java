package com.wwsis.sss.dao;

import com.wwsis.sss.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int userId) {
        return users.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void updateUser(User user) {
        int index = users.indexOf(getUserById(user.getId()));
        if (index >= 0) {
            users.set(index, user);
        }
    }

    @Override
    public void deleteUser(int userId) {
        users.removeIf(u -> u.getId() == userId);
    }
}
