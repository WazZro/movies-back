package com.psuti.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EntityScan("com.psuti.movies.models")
@ComponentScans({
        @ComponentScan("com.psuti.movies.controllers"),
        @ComponentScan("com.psuti.movies.configs"),
        @ComponentScan("com.psuti.movies.services")
})
public class MoviesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class, args);
    }

}
