package com.trofimov.crud.service;

import com.trofimov.crud.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    void editUser(User user);

    void removeUserById(int id);

}
