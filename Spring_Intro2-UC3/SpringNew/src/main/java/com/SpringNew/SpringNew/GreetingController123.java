package com.SpringNew.SpringNew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController123 {

    private final GreetingService123 greetingService;

    @Autowired
    public GreetingController123(GreetingService123 greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/message")
    public ResponseEntity<String> getGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        String message = greetingService.getGreeting(firstName, lastName);
        return ResponseEntity.ok(message);
    }
}

