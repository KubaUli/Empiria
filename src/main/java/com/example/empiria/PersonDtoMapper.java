package com.example.empiria;

import org.springframework.stereotype.Service;

@Service
public class PersonDtoMapper {
    Person person = new Person();
    Person map(PersonDto dto){

        person.setName(dto.getFirstName());
        person.setLastName(dto.getLastName());
        person.setEmail(dto.getEmail());
        person.setPhoneNumber(dto.getPhoneNumber());
        person.setStartDate(dto.getStartDate());
        person.setAddres(dto.getAddres());
        person.setPostCode(dto.getPostCode());
        person.setTown(dto.getTown());
        return person;

    }
    Person addresMap(PersonDto dto){
        person.setAddres(dto.getAddres());
        person.setPostCode(dto.getPostCode());
        person.setTown(dto.getTown());
        return person;
    }
}
