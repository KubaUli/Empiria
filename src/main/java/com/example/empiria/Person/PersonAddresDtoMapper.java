package com.example.empiria.Person;

import com.example.empiria.Person.PersonAddres.PersonAddres;
import com.example.empiria.Person.PersonAddres.PersonAddresDto;
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
