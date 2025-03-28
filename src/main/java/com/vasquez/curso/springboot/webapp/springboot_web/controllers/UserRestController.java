package com.vasquez.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasquez.curso.springboot.webapp.springboot_web.models.User;
import com.vasquez.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details()  { 
        UserDto userDto = new UserDto();
        User user = new User("Renzo", "Vasquez");
        userDto.setTitle("Hola Mundo Spring Boot!");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap()  { 
        User user = new User("Renzo", "Vasquez");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot!");
        body.put("user", user);
        return body;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Renzo", "Vasquez");
        User user2 = new User("Jotade", "Flores");
        User user3= new User("Pepito", "Rojas");

        List<User> users = Arrays.asList(user,user2,user3);

        /* 
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);*/

        return users;
    }

}
