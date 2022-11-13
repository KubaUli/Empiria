package com.example.empiria.PersonAddres;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PersonAddresController {
    private final PersonAddresService personAddresService;

    public PersonAddresController(PersonAddresService personAddresService) {
        this.personAddresService = personAddresService;
    }

    @GetMapping("/addUser")
    String addUser(Model model) {
        model.addAttribute("personAddres", new PersonAddresDto());
        return "addUser";
    }

    @PostMapping("/registerUser")
    String registerUser(@Valid @ModelAttribute("client") PersonAddresDto personAddresDto,
                        BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
                return "addUser";
        } else {
            personAddresService.registerAddres(personAddresDto);
           return "redirect:success";
        }
    }
}
