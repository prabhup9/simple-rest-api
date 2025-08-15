package com.example.demo.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;

@Service
public class RapidApiImplementation {

    @Autowired
    private RestTemplate restTemplate;
    
    public ResponseEntity<String> getRapidApiDetails(){
        String url = "https://weatherbit-v1-mashape.p.rapidapi.com/forecast/3hourly?lat=35.5&lon=-78.5&units=imperial&lang=en";
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com");
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class, headers);

        if(response.getStatusCode().is2xxSuccessful()) {
            return response;
        } else {
            return ResponseEntity.status(response.getStatusCode()).body("Error: " + response.getStatusCode());
        }
    }
    
    
    
}
