package com.example.empiria.Person;

import com.example.empiria.Person.Person;
import com.example.empiria.Person.PersonService;
import com.example.empiria.PersonAddres.PersonAddres;
import com.example.empiria.PersonAddres.PersonAddresDto;
import org.springframework.stereotype.Service;

@Service
public class PersonAddresDtoMapper  {

    public PersonAddres map(PersonAddresDto addresDto){
        PersonAddres personAddres = new PersonAddres();
        personAddres.setAddres(addresDto.getAddres());
        personAddres.setPostCode(addresDto.getPostCode());
        personAddres.setTown(addresDto.getTown());
        personAddres.setPerson(PersonService.persontransfer);
        return personAddres;
    }

}
