package com.sadhkaveragi.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // controller method to show initial HTML form

    @RequestMapping("/showForm")
    public String showFarm() {
        return "helloworld-form";
    }

    // controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // controller method to read form data and adding data to model

    @RequestMapping("/processForm/v2")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the html form
        String name = request.getParameter("studentName");

        // convert to all uppercase
        name = name.toUpperCase();

        // create message
        String message = "Yo! " + name;

        // add message to the model
        model.addAttribute("message", message);

        return "helloworld";
    }
}
