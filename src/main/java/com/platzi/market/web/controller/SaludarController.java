package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarController {
    @GetMapping("/saludar")
    public String getSaludo() {
        return "Hola mundo";
    }
}
