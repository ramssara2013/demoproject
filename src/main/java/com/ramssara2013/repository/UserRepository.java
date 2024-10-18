package com.ramssara2013.repository;

import com.ramssara2013.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, String> {


    List<User> findUserByEmail(String email);

    List<User> findUserByNameAndEmail(String name, String email);

    List<User> findUserByName(String name);
}
