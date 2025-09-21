package com.poo.encapsulamiento.controller;

import com.poo.encapsulamiento.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author garci
 */
@RestController
@RequestMapping("/persona")
public class PersonaController {
    @GetMapping("/datos")
    public Persona datosPersona(){
        // Creo a la persona usando el encapsulamiento y su constructor
        Persona personita = new Persona();
        personita.setNombre("Roberto Joaquin");
        personita.setPaterno("Garcia");
        personita.setMaterno("Hernandez");
        personita.setEdad(21);
        // Retorno el objeto personita con los datos previemente llenados
        // con los setter
        return personita;
    }
}
