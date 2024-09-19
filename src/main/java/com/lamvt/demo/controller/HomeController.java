package com.lamvt.demo.controller;

import com.lamvt.demo.config.ApplicationConfigurationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {
    
    private final ApplicationConfigurationProperties applicationConfigurationProperties;

    @GetMapping("/")
    public String getStatus(){
        return "Say hello from " + applicationConfigurationProperties.getAuthorName();
    }
}
