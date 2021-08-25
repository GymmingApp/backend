package dev.jsalvag.gymming.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("")
    public String hi(){
        return "Welcome to Gymming API REST 😎✌";
    }
}
