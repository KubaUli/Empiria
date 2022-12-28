package com.example.empiria.ClientPanel;

import com.example.empiria.Person.Person;
import com.example.empiria.Person.PersonAddres.PersonAddres;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientPanelDtoMapper {


    ClientPanelDto map(Optional<Person> dto, Optional<PersonAddres> addresDto) {
        ClientPanelDto panelDto = new ClientPanelDto();
        panelDto.setPersonId(dto.get().getId());
        panelDto.setPersonName(dto.get().getName());
        panelDto.setPersonLastName(dto.get().getLastName());
        panelDto.setPersonPhoneNumber(dto.get().getPhoneNumber());
        panelDto.setPersonEmail(dto.get().getEmail());
        panelDto.setPersonStartDate(dto.get().getStartDate());
        panelDto.setPersonDateOfAccountCreation(dto.get().getDateOfAccountCreation());
        panelDto.setAddres(addresDto.get().getAddres());
        panelDto.setPostCode(addresDto.get().getPostCode());
        panelDto.setTown(addresDto.get().getTown());

        return panelDto;


    }

}
