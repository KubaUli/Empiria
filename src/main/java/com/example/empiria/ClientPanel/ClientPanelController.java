package com.example.empiria.ClientPanel;

import com.example.empiria.Person.Person;
import com.example.empiria.Person.PersonAddres.PersonAddres;
import com.example.empiria.Person.PersonAddres.PersonAddresRepository;
import com.example.empiria.Person.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientPanelController {
   private final ClientPanelService clientPanelService;
   private final ClientPanelDto clientPanelDto;
private final PersonAddresRepository personAddresRepository;
private final PersonRepository personRepository;
    public ClientPanelController(ClientPanelService clientPanelService, ClientPanelDto clientPanelDto, PersonAddresRepository personAddresRepository, PersonRepository personRepository) {
        this.clientPanelService = clientPanelService;
        this.clientPanelDto = clientPanelDto;
        this.personAddresRepository = personAddresRepository;
        this.personRepository = personRepository;
    }


    @GetMapping("/ClientPanel/{id}")
    String newUser(@PathVariable long id, Model model) {

        ClientPanelDto panelDto = clientPanelService.registerSave(id);

        model.addAttribute("clientPanel",panelDto );

        return "ClientPanel";
    }

  /*  @GetMapping("/ClientPanel/{id}")
    String newUser(@PathVariable long id, Model model) {

        Optional<Person> byId = personRepository.findById(id);
        List<PersonAddres> personAddres = personAddresRepository.findByPerson(id);
        clientPanelService.registerSave(byId,personAddres);
        model.addAttribute("clientPanel",clientPanelDto );

        return "clientPanel";
    }*/
        }


    