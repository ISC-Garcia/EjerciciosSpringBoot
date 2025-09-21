package com.poo.herencia.model;

/**
 *
 * @author garci
 */
public class Gato extends Animal{
    private String raza;
    
    public Gato() {
    }
    public Gato(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }  
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    
    public String ataque(){
        return "El gato con nombre: " + getNombre() + ", va a rasguñar";
    }
}
