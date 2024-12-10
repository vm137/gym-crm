package com.epam.service;

import com.epam.model.Trainee;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {
    public Trainee createTrainee() {
        return new Trainee(1, "John Doe");
    }
}
