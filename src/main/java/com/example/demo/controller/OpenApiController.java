package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OpenApiService;

@RestController
public class OpenApiController {

    @Autowired
    private OpenApiService openApiService;

    @GetMapping("/openApi")
    public String openApi(){
        return openApiService.getCall().toString();
    }


}
