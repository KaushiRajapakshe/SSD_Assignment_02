package com.techprimers.security.springbootfacebookloginexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


// map to /user request
@RestController
@RequestMapping("/user")
public class UserController {

    // GET HTTP call
    @GetMapping
    public Principal getUser(Principal user) {
        return user;
    }
}
