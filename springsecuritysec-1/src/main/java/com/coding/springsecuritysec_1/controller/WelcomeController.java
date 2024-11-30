package com.coding.springsecuritysec_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/")
    public String inti(){
        return  "welcome to spring security";
    }
}
