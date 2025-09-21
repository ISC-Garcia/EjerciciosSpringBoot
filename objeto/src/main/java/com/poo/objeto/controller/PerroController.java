package com.poo.objeto.controller;

import com.poo.objeto.model.Perro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author garci
 */
@RestController
@RequestMapping("/perros")
public class PerroController {
    @GetMapping("/sonidos")
    public String creandoPerrito(){
        // Aqui estoy creando un objeto de tipo Perro
        Perro perrito = new Perro("Firulais", "San bernaedo"); 
        // Aqui estoy usando el objeto perrito de tipo Perro
        return "El perrito se esta creando..." + perrito.ladrar();
    }
}
