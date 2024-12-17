package com.epam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Trainee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
}
