package com.lamvt.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getStatus(){
        return "Say hello from Vo Truong Lam";
    }
}
