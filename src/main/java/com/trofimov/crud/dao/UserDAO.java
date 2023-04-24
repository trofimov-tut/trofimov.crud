package com.trofimov.crud.dao;

import com.trofimov.crud.model.User;
import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    void editUser(User user);

    void removeUserById(int id);

}
