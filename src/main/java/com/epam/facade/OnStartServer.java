package com.epam.facade;

import com.epam.dao.TraineeDao;
import com.epam.model.Trainee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OnStartServer implements ApplicationListener<ApplicationReadyEvent> {

    Logger logger = LoggerFactory.getLogger(OnStartServer.class);

    @Autowired
    private TraineeDao traineeDao;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("CRM started...");

        Trainee t1 = new Trainee();
        t1.setName("John Dow");
        traineeDao.save(t1);

        Trainee t2 = new Trainee();
        t2.setName("Jane Dow 33");
        traineeDao.save(t2);

        Trainee s1 = traineeDao.get(2);
        System.out.println(s1.toString());

        System.out.println("---");
    }
}
