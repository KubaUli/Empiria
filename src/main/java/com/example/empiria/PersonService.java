package com.example.empiria;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonDtoMapper personDtoMapper;
    static Boolean newClient;


    public PersonService(PersonRepository personRepository, PersonDtoMapper personDtoMapper) {
        this.personRepository = personRepository;
        this.personDtoMapper = personDtoMapper;
    }

    public void register(PersonDto personDto) {

        if ( personRepository.findByName(personDto.getFirstName()).isEmpty() ||
                personRepository.findByLastName(personDto.getLastName()).isEmpty() ||
                personRepository.findByPhoneNumber(personDto.getPhoneNumber()).isEmpty() ||
                        personRepository.findByEmail(personDto.getEmail()).isEmpty() ||
                        personRepository.findByStartDate(personDto.getStartDate()).isEmpty())
        {
            Person person = personDtoMapper.map(personDto);
            newClient = true;



        }
    }
    public void registerUser(PersonDto personDto){
        Person person = personDtoMapper.addresMap(personDto);
        personRepository.save(person);
        newClient = false;
    }
}
