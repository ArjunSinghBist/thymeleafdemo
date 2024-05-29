package com.sadhkaveragi.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
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

    // controller method to read form
}
