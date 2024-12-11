package com.epam.storage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfig {

    @Bean
    TraineeStorage createTraineeStorage() {
        return new TraineeStorage();
    }
}
