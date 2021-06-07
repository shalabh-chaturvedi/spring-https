package com.example.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/ssl")
    public String retrieve() {
        return "HTTPS authentication";
    }
}
