package com.vasquez.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vasquez.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model /*tambien se puede usar el Map<String,Object> en ves de Model*/)  { 
        User user = new User("Renzo", "Vasquez");
        user.setEmail("renvch@hotmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot!");
        model.addAttribute("user", user);
        return "details";
    }
}
