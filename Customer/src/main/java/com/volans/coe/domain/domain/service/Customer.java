package com.volans.coe.domain.domain.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello Clarice";
    }
}
