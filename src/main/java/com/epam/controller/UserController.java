package com.epam.controller;

import com.epam.model.onetoone.User;
import com.epam.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get-user")
    public User getUser(@Param(value = "id") int id) {
        User userById = userRepository.getUserById(id);
        log.info("userById[{}]: {}", id, userById);
        return userById;
    }
}
