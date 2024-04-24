package com.games.dndBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories
public class DndApplication {

    public static void main(String[] args) {
        SpringApplication.run(DndApplication.class, args);
    }
}