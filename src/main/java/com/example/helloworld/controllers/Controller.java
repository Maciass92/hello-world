package com.example.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("")
    public String showHelloWorld(){

        return "Hello World";
    }
}
