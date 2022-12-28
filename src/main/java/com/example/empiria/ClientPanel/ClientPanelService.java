package com.example.empiria.ClientPanel;

import com.example.empiria.Person.Person;
import com.example.empiria.Person.PersonAddres.PersonAddres;
import com.example.empiria.Person.PersonAddres.PersonAddresRepository;
import com.example.empiria.Person.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientPanelService {
   private final ClientPanelDtoMapper clientPanelDtoMapper;
   private final PersonAddresRepository personAddresRepository;
   private final PersonRepository personRepository;
   private final NoteRepository noteRepository;

    public ClientPanelService(ClientPanelDtoMapper clientPanelDtoMapper, PersonAddresRepository personAddresRepository, PersonRepository personRepository, NoteRepository noteRepository) {
        this.clientPanelDtoMapper = clientPanelDtoMapper;
        this.personAddresRepository = personAddresRepository;
        this.personRepository = personRepository;
        this.noteRepository = noteRepository;
    }

    public ClientPanelDto registerSave(long id) {
        Optional<Person> person = personRepository.findById(id);
        Optional<PersonAddres> personAddres = personAddresRepository.findById(id);
        /*List<Note> notes = noteRepository.findByPerson(id);*/
        ClientPanelDto clientPanelDto = clientPanelDtoMapper.map(person, personAddres);

    return clientPanelDto;

    }
}
