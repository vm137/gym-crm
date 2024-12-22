package com.epam.facade;

import com.epam.model.onetoone.Address;
import com.epam.model.onetoone.User;
import com.epam.repository.UserRepository;
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
    private UserRepository userRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("CRM started...");

        // one-to-one
        // https://www.baeldung.com/jpa-one-to-one
        User t1 = new User();
        t1.setName("John Dow");

        Address a1 = new Address();
        a1.setStreet("123 Main Street");
        a1.setCity("New York");
        t1.setAddress(a1);

        userRepository.save(t1);


        System.out.println("---");
    }
}
