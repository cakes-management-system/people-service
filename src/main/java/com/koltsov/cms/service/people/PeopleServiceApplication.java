package com.koltsov.cms.service.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PeopleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleServiceApplication.class, args);
    }

}
