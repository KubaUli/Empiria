package com.example.empiria.Person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonDtoMapper personDtoMapper;
    static boolean newClient;

 public static Person persontransfer;
    public PersonService(PersonRepository personRepository, PersonDtoMapper personDtoMapper) {
        this.personRepository = personRepository;
        this.personDtoMapper = personDtoMapper;
    }


    public void register(PersonDto personDto) {

        if (personRepository.findByName(personDto.getFirstName()).isEmpty() ||
                personRepository.findByLastName(personDto.getLastName()).isEmpty() ||
                personRepository.findByPhoneNumber(personDto.getPhoneNumber()).isEmpty() ||
                personRepository.findByEmail(personDto.getEmail()).isEmpty() ||
                personRepository.findByStartDate(personDto.getStartDate()).isEmpty()) {

            newClient=true;



        }
    }
    public void registerSave(PersonDto personDto) {
        Person person = personDtoMapper.map(personDto);
        persontransfer = person;
        personRepository.save(person);

    }




}

