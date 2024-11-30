package com.example.tesing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
    @Id
    private int id;
    private String name;
    private String email;

    public User(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }





}
