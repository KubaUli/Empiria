package com.example.empiria;


import com.example.empiria.Person.Person;
import com.example.empiria.Person.PersonAddres.PersonAddresRepository;
import com.example.empiria.Person.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class EmpiriaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(EmpiriaApplication.class, args);
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        PersonAddresRepository personAddresRepository = context.getBean(PersonAddresRepository.class,args);
   /*     ClientPanelRepository clientPanelRepository = context.getBean(ClientPanelRepository.class,args);*/




    }

}
