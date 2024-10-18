package com.ramssara2013.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data // Generates getters, setters, toString, equals, and hashCode
@Builder  // Enables the Builder pattern
@AllArgsConstructor // Generates an all-args constructor
@Entity(name = "\"user\"")
public class User {
    @Id
    private String id;

    private String name;
    private String email;

    public User() {
        this.id = UUID.randomUUID().toString(); // Generate a new UUID as String
    }
}
