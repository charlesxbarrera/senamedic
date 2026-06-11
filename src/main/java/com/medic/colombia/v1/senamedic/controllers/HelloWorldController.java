package com.medic.colombia.v1.senamedic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    @GetMapping()
    public String inicio(){
        System.out.println("paso por el inicio");
        return "esta en el inicio";

    }

    @GetMapping("/saludar")

    public String saludar() {
        System.out.println("paso por el metodo saludar");
        return "Hola Adso 2026";

    }


}
