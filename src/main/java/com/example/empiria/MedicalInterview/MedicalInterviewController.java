package com.example.empiria.MedicalInterview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MedicalInterviewController {
    private final MedicalInterviewService medicalInterviewService;

    public MedicalInterviewController(MedicalInterviewService medicalInterviewService) {
        this.medicalInterviewService = medicalInterviewService;
    }

    @GetMapping("/MedicalInterview")
    String addUser(Model model) {
        model.addAttribute("personAddres", new MedicalInterviewDto());
        return "addUser";
    }

    @PostMapping("/InterviewADD")
    String registerUser(@Valid @ModelAttribute("interview") MedicalInterviewDto medicalInterviewDto,
                        BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
                return "MedicalInterview";
        } else {
            medicalInterviewService.registerInterview(medicalInterviewDto);
           return "redirect:success";
        }
    }
}
