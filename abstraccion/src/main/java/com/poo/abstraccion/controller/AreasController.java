package com.poo.abstraccion.controller;

import com.poo.abstraccion.modelo.Cuadrado;
import com.poo.abstraccion.modelo.Triangulo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author garci
 */
@RestController
@RequestMapping("/areas")
public class AreasController {
    @GetMapping("/cuadrado/{x}")
    public String obtenerAreaCuadrado(@PathVariable double x){
        Cuadrado cuadradito = new Cuadrado("Cuadrado", x, 0);
        
        return "El area de " + cuadradito.getNombre() + " es: " + cuadradito.area();
    }
    @GetMapping("/triangulo/{base}/{altura}")
    public String obtenerAreaTriangulo(@PathVariable double base, @PathVariable double altura){
        Triangulo triangulin = new Triangulo("Triangulo", base, altura);
        
        return "El area de " + triangulin.getNombre() + " es: " + triangulin.area();
    }
}
