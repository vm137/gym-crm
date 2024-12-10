package com.epam.storage;

import com.epam.model.Trainee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TraineeStorage {
    private final Map<Integer, Trainee> map = new HashMap<>();

    public void addTrainee(Trainee trainee) {
        map.put(1, trainee);
    }

    public Trainee getTrainee(int id) {
        return map.get(id);
    }
}
