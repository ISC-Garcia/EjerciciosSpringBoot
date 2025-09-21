package com.poo.herencia.controller;

import com.poo.herencia.model.Gato;
import com.poo.herencia.model.Perro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author garci
 */
@RestController
@RequestMapping("/animal")
public class AnimalController {
    @GetMapping("/perro")
    public Perro perrito(){
        Perro solovino = new Perro("Chihuahua",  "Solovino");
        return solovino;
    }
    @GetMapping("/perro/ladra")
    public String perritoLadra(){
        Perro solovino = new Perro("Chihuahua",  "Solovino");
        return solovino.ladrar();
    }
    @GetMapping("/gato")
    public Gato gatito(){
        Gato gatoConBotas = new Gato("Mestizo", "Garfield");
        return gatoConBotas;
    }
    @GetMapping("/gato/araña")
    public String gatoAraña(){
        Gato gatoConBotas = new Gato("Mestizo",  "Garfield");
        return gatoConBotas.ataque();
    }
}