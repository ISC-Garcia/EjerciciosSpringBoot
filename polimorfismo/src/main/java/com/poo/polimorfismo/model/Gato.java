package com.poo.polimorfismo.model;

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
    // Aqui se sobreescribe el metodo de la clase Animal
    @Override
    public String sonido(){
        return "Miau";
    }
}
