package com.example.empiria.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonDtoMapper {

    Person map(PersonDto dto){
        Person person = new Person();
        person.setName(dto.getFirstName());
        person.setLastName(dto.getLastName());
        person.setEmail(dto.getEmail());
        person.setPhoneNumber(dto.getPhoneNumber());
        person.setStartDate(dto.getStartDate());
        return person;


    }

}
