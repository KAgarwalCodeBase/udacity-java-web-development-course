package com.udactiy.jwnd.spring.chapter3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("welcomeMessage", Instant.now().toString());
        return "home";
    }
}
