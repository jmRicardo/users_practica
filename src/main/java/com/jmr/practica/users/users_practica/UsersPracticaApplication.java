package com.jmr.practica.users.users_practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.jmr.practica.entities_practica.libreria_custom_users_practica.models"})
@SpringBootApplication
public class UsersPracticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersPracticaApplication.class, args);
    }

}
