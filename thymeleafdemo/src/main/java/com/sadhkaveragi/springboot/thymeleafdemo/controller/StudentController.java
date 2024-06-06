package com.sadhkaveragi.springboot.thymeleafdemo.controller;

import com.sadhkaveragi.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    // inject from the properties file
    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    @GetMapping("/showStudentForm")
    public String showForm(Model model) {

        // Create Student Object
        Student theStudent = new Student();

        // Add student object to the model
        model.addAttribute("student", theStudent);
        // add the list of countries to the model
        model.addAttribute("countries", countries);
        // add the list of languages to the model
        model.addAttribute("languages", languages);
        //k add the list of systems to the model
        model.addAttribute("systems", systems);
        return "student-form";
    }

    // post mapping for student form processing
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input
        System.out.println("the student " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}
