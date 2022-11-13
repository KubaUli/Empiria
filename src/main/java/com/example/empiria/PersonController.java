package com.example.empiria;

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
    PersonDto personDto = new PersonDto();

      @GetMapping("/")
    String home(Model model) {
        model.addAttribute("person",personDto);
        return "index";
    }

    @PostMapping("/register")
    String register(PersonDto personDto) {
        personService.register(personDto);
         if (PersonService.newClient=true){
            return "redirect:addUser";
        }else{
            return "redirect:success";
        }
    }

    @GetMapping("/success")
    String success() {
        return "success";
    }

    @GetMapping("/addUser")
    String addUser(Model model){
          model.addAttribute("person", personDto);
        return "addUser";
    }
    @PostMapping("/registerUser")
    String registerUser(PersonDto personDto) {
     /*   if (bindingResult.hasErrors()) {
            return "addUser";
        } else {*/
            personService.registerUser(personDto);

            return "redirect:success";
        }
    }


