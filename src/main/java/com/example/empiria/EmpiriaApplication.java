package com.example.empiria;

import com.example.empiria.Person.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class EmpiriaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(EmpiriaApplication.class, args);
        PersonRepository personRepository = context.getBean(PersonRepository.class);


    }

}
