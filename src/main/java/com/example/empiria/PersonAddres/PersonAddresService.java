package com.example.empiria.PersonAddres;

import com.example.empiria.Person.PersonAddresDtoMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonAddresService {
    private final PersonAddresRepository personAddresRepository;
    private final PersonAddresDtoMapper personAddresDtoMapper;



    public PersonAddresService(PersonAddresRepository personAddresRepository, PersonAddresDtoMapper personAddresDtoMapperDtoMapper) {
        this.personAddresRepository = personAddresRepository;
        this.personAddresDtoMapper = personAddresDtoMapperDtoMapper;

    }

    public void registerAddres(PersonAddresDto personAddresDto) {
            PersonAddres personAddres = personAddresDtoMapper.map(personAddresDto);
            personAddresRepository.save(personAddres);






        }
    }



