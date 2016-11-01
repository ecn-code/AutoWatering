package com;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.inject.Inject;

/**
 * Created by eliasibz on 31/10/16.
 */
@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class Application {



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}