package com.poo.abstraccion.modelo;

/**
 *
 * @author garci
 */
public abstract class FiguraGeometrica {
    private String nombre;
    private double x;
    private double y;

    public FiguraGeometrica(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }
    // STTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    // GETTER
    public String getNombre() {
        return nombre;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    // Este metodo abstracto debe ser implementado si o si por las subclases
    public abstract double area();
}
