package com.ramssara2013.service;

import com.ramssara2013.entity.User;

import java.util.List;
import java.util.Optional;

public interface UsersServiceInterface {
    User addUser(User user);
    User getUserById(String id);
    List<User> getAllUsers();
}
