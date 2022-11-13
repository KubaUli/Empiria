package com.example.empiria.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PersonController {
    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }



    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("person", new PersonDto());

        return "index";
    }

    @PostMapping("/register")
    String register(@Valid @ModelAttribute("client") PersonDto personDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
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
    String success(Model model)
    {
        model.addAttribute("person",PersonService.persontransfer);
        return "success";
    }


}


