package com.poo.abstraccion.modelo;

/**
 *
 * @author garci
 */
public class Cuadrado extends FiguraGeometrica{
    public Cuadrado(String nombre, double x, double y) {
        super(nombre, x, y);
    }
    // Uso el metodo abstracto de la clase FiguraGeometrica
    @Override
    public double area(){
        return getX() * getX();
    }
    
}
