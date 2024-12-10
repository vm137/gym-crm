package com.epam;

import com.epam.dao.TraineeDao;
import com.epam.model.Trainee;
import com.epam.service.TraineeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Facade {

    @Autowired
    private TraineeService traineeService;

    @Autowired
    private TraineeDao traineeDao;

    @PostConstruct
    void startGymCrm() {
        System.out.println("CRM started...");

        Trainee trainee1 = traineeService.createTrainee();
        traineeDao.save(trainee1);

        Trainee fromMap = traineeDao.get(1);
        System.out.println(fromMap);
    }
}
