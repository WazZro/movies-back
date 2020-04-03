package com.psuti.movies.controllers;

import com.psuti.movies.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
public class MainController {
    @Autowired
    EntityManager entityManager;

    @GetMapping(path = "/test/{id}")
    public User testUser(@PathVariable int id) {
        System.out.println(id);
        return entityManager.find(User.class, id);
     }

    @GetMapping
    public String getOk() {
        return "OK";
    }
}
