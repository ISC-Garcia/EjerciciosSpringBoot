package com.poo.claseAbstractaYInterfaz.model;

/**
 *
 * @author Joaquin
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    // Metodo abstracto que obliga a las clases hijas a implementar
    public abstract double impuesto();
    // Metodo comun en la clase
    public String descripcion(){
        return marca + " - Modelo: " + modelo + " - Año: " + anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
