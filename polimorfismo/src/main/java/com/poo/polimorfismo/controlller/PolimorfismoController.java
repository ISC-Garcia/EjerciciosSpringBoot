package com.poo.polimorfismo.controlller;

import com.poo.polimorfismo.model.Animal;
import com.poo.polimorfismo.model.Gato;
import com.poo.polimorfismo.model.Perro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author garci
 */
@RestController
@RequestMapping("/animales")
public class PolimorfismoController {
    @GetMapping("/sonidos")
    public String haciendoSonidos(){
        Animal animal_1 = new Animal(); 
        Animal animal_2 = new Animal();
        animal_1 = new Perro("Golden Retriver", "Mister Dorado"); // Aqui ya estoy haciendo el polimorfismo
        animal_2 = new Gato("Siames", "Señor gris"); // Aqui ya estoy haciendo el polimorfismo
                
        return "El objeto animal_1: " + animal_1.getNombre() + " hace el sonido de perro: " + animal_1.sonido() + ".\nEl objeto animal_2: " + animal_2.getNombre() + " hace el sonido de gato: " + animal_2.sonido() + ".";
    }
}
