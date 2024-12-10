package com.epam.model;

public class Trainee {
    private int id;
    private String name;

    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
