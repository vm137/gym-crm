package com.epam.facade;

import com.epam.dao.TraineeDao;
import com.epam.model.Trainee;
import com.epam.service.TraineeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OnStartServer implements ApplicationListener<ApplicationReadyEvent> {

    Logger logger = LoggerFactory.getLogger(OnStartServer.class);

    @Autowired
    private TraineeService traineeService;

    @Autowired
    private TraineeDao traineeDao;

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("CRM started...");

        Trainee trainee1 = traineeService.createTrainee();
        traineeDao.save(trainee1);

        Trainee fromMap = traineeDao.get(1);
        logger.info("Trainee 1: {}", fromMap);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            //            System.out.println("bean: " + name);
        }
    }
}
