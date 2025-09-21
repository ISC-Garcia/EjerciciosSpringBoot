package com.poo.encapsulamiento.model;

/**
 *
 * @author garci
 */
public class Persona {
    // Atributos privados
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;

    public Persona() {
    }
    public Persona(String nombre, String paterno, String materno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }
    // SETTER ENCAPSULAMIENTO
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    // GETTER ENCAPSULAMIENTO
    public String getNombre() {
        return nombre;
    }
    public String getPaterno() {
        return paterno;
    }
    public String getMaterno() {
        return materno;
    }
    public int getEdad() {
        return edad;
    }
    
    
    
}
