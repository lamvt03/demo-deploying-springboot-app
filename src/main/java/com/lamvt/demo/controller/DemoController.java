package com.lamvt.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    private int count;

    @GetMapping
    public String get(){
        count++;
        return String.format("<h1> Response from demo controller: %s</h1>", count);
    }
}
