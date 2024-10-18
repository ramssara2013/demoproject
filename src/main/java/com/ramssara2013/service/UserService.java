package com.ramssara2013.service;

import com.ramssara2013.entity.User;
import com.ramssara2013.exception.UserNotFoundException;
import com.ramssara2013.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UsersServiceInterface {
    private final List<User> users = new ArrayList<>();


    private final UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found for the id: " + id));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> filterUsers(String name, String email) {
        return Optional.ofNullable(name)
                .map(n -> {
                    if (email != null) {
                        return userRepository.findUserByNameAndEmail(n, email);
                    }
                    return userRepository.findUserByName(n);
                })
                .orElseGet(() -> Optional.ofNullable(email)
                        .map(userRepository::findUserByEmail)
                        .orElseGet(userRepository::findAll));
    }


}
