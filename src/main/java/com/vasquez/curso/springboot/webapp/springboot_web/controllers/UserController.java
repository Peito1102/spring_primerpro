package com.vasquez.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("/list")
    public String list(ModelMap model)  { 
        

        //model.addAttribute("users", users);
        model.addAttribute("title","Listado de usuarios!");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {
        List<User> users = Arrays.asList(new User("Joel","Aguilar","ja@hotmail.com"),
            new User("Thomaz", "Vasquez","tva@hotmail.com"), new User("Piero", "Mendieta","pme@hotmail.com"),
            new User("Lizu", "Loayza"));

        return users;
    }

}
