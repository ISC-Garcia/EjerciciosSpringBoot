package com.poo.abstraccion.modelo;

/**
 *
 * @author garci
 */
public class Triangulo extends FiguraGeometrica{
    public Triangulo(String nombre, double x, double y) {
        super(nombre, x, y);
    }
    // Uso el metodo abstracto de la clase FiguraGeometrica
    @Override
    public double area() {
        return (getX() * getY()) / 2;
    }
    
}
