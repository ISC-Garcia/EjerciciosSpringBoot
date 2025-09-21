package com.poo.herencia.model;

/**
 *
 * @author garci
 */
public class Perro extends Animal{ // Perro hereda de Animal
    private String raza;

    public Perro() {
    }
    public Perro(String raza, String nombre) {
        super(nombre); // Herencia del constructor de Animal
        this.raza = raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    // metodo propio de Perro
    public String ladrar(){
        return "El perro con nombre: " + getNombre() + ", esta ladrando";
    }
    
}
