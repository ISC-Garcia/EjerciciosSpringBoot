package com.poo.herencia.model;

/**
 *
 * @author garci
 */
public class Animal { // Clase padre (Herencia)
    private String nombre;

    public Animal() {
    }
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String sonido(){
        return "El animal esta haciendo un sonido";
    }
}
