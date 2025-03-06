package com.SpringNew.SpringNew;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/{name}")
    public GreetingDTO getGreeting(@PathVariable String name) {
        return new GreetingDTO("Hello " + name + "!");
    }

    @PostMapping
    public GreetingDTO createGreeting(@RequestBody GreetingDTO greeting) {
        return new GreetingDTO("Greeting received: " + greeting.getMessage());
    }

    @PutMapping("/{name}")
    public GreetingDTO updateGreeting(@PathVariable String name, @RequestBody GreetingDTO greeting) {
        return new GreetingDTO("Updated greeting for " + name + ": " + greeting.getMessage());
    }

    @DeleteMapping("/{name}")
    public GreetingDTO deleteGreeting(@PathVariable String name) {
        return new GreetingDTO("Greeting for " + name + " deleted.");
    }
}

