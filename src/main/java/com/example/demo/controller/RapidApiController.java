package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.impl.RapidApiImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RapidApiController {
    
    @Autowired
    private RapidApiImplementation rapidApiImplementation;  

    @GetMapping("/rapidApi")
    public ResponseEntity<String> detailss() {
        
         return rapidApiImplementation.getRapidApiDetails();
        
    }
    
}
