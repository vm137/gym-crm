package com.epam.dao;

import com.epam.model.Trainee;
import com.epam.storage.TraineeStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TraineeDao {

    @Autowired
    private TraineeStorage traineeStorage;

    public void save(Trainee trainee) {
        traineeStorage.addTrainee(trainee);
    }

    public Trainee get(int id) {
        return traineeStorage.getTrainee(id);
    }
}
