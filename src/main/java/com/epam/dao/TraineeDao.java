package com.epam.dao;

import com.epam.model.Trainee;
import com.epam.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TraineeDao {

    @Autowired
    private TraineeRepository repository;

    public void save(Trainee trainee) {
        repository.save(trainee);
    }

    public Trainee get(int id) {
        return repository.getTraineeById(id);
    }
}
