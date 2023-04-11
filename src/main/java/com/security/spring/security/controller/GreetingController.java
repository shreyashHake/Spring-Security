package com.security.spring.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class GreetingController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello there!");
    }

    @GetMapping("/say-good-by")
    public ResponseEntity<String> sayGoodBy() {
        return ResponseEntity.ok("Good By!");
    }
}
