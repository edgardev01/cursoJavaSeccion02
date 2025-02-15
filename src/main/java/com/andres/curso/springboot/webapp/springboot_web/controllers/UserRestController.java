package com.andres.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.andres.curso.springboot.webapp.springboot_web.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public Map<String , Object> details() {

        User user = new User( "Andres", "Guzman");

        Map<String , Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);


        return body;
    }
    


}
