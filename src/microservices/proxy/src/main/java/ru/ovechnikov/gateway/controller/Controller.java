package ru.ovechnikov.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping("/health")
    public ResponseEntity<String> healthy() {
        return ResponseEntity.ok(serviceName + " is healthy.");
    }


}
