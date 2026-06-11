package com.medic.colombia.v1.senamedic.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/nombre")

public class Nombrecontroller {

    private ArrayList<String> nombres = new ArrayList<>();


    @PostMapping("/{nombre}")
    public String crear(@PathVariable("nombre") String nombre){

        boolean isAdded = false;

        if (!nombre.isEmpty()) {
            this.nombres.add(nombre);
            isAdded = true;

        }

        return isAdded ? "Nombre agragado" : "Nombre no agregado";

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
