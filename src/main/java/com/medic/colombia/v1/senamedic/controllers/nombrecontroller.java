package com.medic.colombia.v1.senamedic.controllers;

import ch.qos.logback.core.read.ListAppender;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController("/nombre")

public class nombrecontroller {

    private ArrayList<String>nombres = new ArrayList<>();


    @PostMapping("/{nombre}")
    public String crear(@PathVariable("nombre") String nombre){

        boolean isAdded = false;

        if (!nombre.isEmpty()) {
            this.nombres.add(nombre);
            isAdded = true;

        }

        return "Nombre agragado" : "Nombre no agregado";

    }
    @GetMapping()
    public String listar(){
        return  "";
    }

    @PutMapping()
    public String editar(){
        return "";

    }

    @DeleteMapping
    public String eliminar(){
        return "";
    }

}
