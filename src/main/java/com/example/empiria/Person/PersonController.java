package com.example.empiria.Person;

import com.example.empiria.ClientPanel.ClientPanelDto;
import com.example.empiria.ClientPanel.ClientPanelService;
import com.example.empiria.SortTable.SortAndFilterDto;
import com.example.empiria.SortTable.SortTableService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class PersonController {
    private final PersonService personService;
    private final PersonRepository personRepository;
    private final SortTableService sortTableService;
private final ClientPanelService clientPanelService;
private final ClientPanelDto clientPanelDto;

    public PersonController(PersonService personService, PersonRepository personRepository, SortTableService sortTableService, ClientPanelService clientPanelService, ClientPanelDto clientPanelDto) {
        this.personService = personService;
        this.personRepository = personRepository;
        this.sortTableService = sortTableService;
        this.clientPanelService = clientPanelService;
        this.clientPanelDto = clientPanelDto;
    }


    @GetMapping("/newUser")
    String newUser(Model model) {
        model.addAttribute("person", new PersonDto());

        return "newUser";
    }

    @PostMapping("/register")
    String register(@Valid @ModelAttribute("client") PersonDto personDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "newUser";
        } else {
            personService.register(personDto);
            if (PersonService.newClient) {
                PersonService.newClient = false;
                personService.registerSave(personDto);
                return "redirect:addUser";
            } else {
                return "redirect:success";
            }

        }


    }




    @GetMapping("/success")
    String success(Model model) {
        model.addAttribute("person", PersonService.persontransfer);
        return "success";
    }


    @PostMapping("/medicaltunel")
    String medicaltunelr() {
        return "redirect:MedicalInterview";
    }

    @PostMapping("/returnToHome")
    String returnToHome() {
        return "redirect:index";
    }

    @GetMapping("/")
    String home(Model model) {
        List<Person> allClients = sortTableService.sortClientList();
        model.addAttribute("ClientList", allClients);
        model.addAttribute("sortAndFilterDto",new SortAndFilterDto());
        return "index";
    }

    @PostMapping("/sortById")
    String sortById( @ModelAttribute("sortAndFilterDto") SortAndFilterDto sortAndFilterDto) {
sortTableService.setSortingParametr(1);
        return "index";
    }
    @PostMapping("/sortByName")
    String sortByName( @ModelAttribute("sortAndFilterDto") SortAndFilterDto sortAndFilterDto) {
        sortTableService.setSortingParametr(2);
        return "index";
    }
    @PostMapping("/sortByLastName")
    String sortByLastName( @ModelAttribute("sortAndFilterDto") SortAndFilterDto sortAndFilterDto) {
        sortTableService.setSortingParametr(3);
        return "index";
    }

    @PostMapping("/NewClient")
    String getNewClient() {
        return "redirect:newUser";
    }

    @PostMapping("/add")
    String addClient() {
        return "redirect:newUser";
    }
    }




