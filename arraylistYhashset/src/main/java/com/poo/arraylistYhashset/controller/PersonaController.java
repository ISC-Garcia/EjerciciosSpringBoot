package com.poo.arraylistYhashset.controller;

import com.poo.arraylistYhashset.model.Comparacion;
import com.poo.arraylistYhashset.model.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Joaquin
 */
@RestController
@RequestMapping("/persona")
public class PersonaController {
    private List<String> nombresLista = new ArrayList<>();
    private Set<String> nombresHash = new HashSet<>();
    @GetMapping("/comparar")
    public Object comparar(){
        String mensaje; // Hago la comparacion y retorno los valores
        if(nombresLista.size() > nombresHash.size()) mensaje = "El arrayList si contuvo los nombres duplicados";
        else mensaje = "El hashSet no contuvo los nombres duplicados";
        return new Comparacion(nombresLista, nombresHash, mensaje); 
    }
    @PostMapping("/arrayList/agregar")
    public String agregarArrayList(@RequestBody Persona nombre){
        // Aqui agrego un nombre de una persona e imprimo el nombre que se agrego
        // para verificar
        nombresLista.add(nombre.getNombre()); // El arrayList si permite elementos duplicados
        return "Nombre agregado a ArrayList: " + nombre.getNombre();
    }
    @PostMapping("/hashSet/agregar")
    public String agregarHashSet(@RequestBody Persona nombre){
        // Aqui agrego un nombre de una persona e imprimo el nombre que se agrego
        // para verificar
        nombresHash.add(nombre.getNombre()); // El hashSet no permite elementos duplicados
        return "Nombre agregar a HashSet: " + nombre.getNombre();
    } 
}
