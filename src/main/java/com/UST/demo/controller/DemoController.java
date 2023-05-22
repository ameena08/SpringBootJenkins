package com.UST.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {


    @GetMapping("/welcome")
    public String welcome(){
        return "welcome Ameena";
    }
    @GetMapping("/hi")
    public String welcomeAmeena(){
        return "Hello";
    }
}
