package com.poo.claseAbstractaYInterfaz.model;

/**
 *
 * @author Joaquin
 */
public class AutoElectrico extends Vehiculo implements Electrico{

    public AutoElectrico(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }
    // Metodo abstracto implementado
    @Override
    public double impuesto() {
        return 999.99;
    }
    // Metodo de la interfaz implementado
    @Override
    public String recargar() {
        return "Recargando vehiculo electrico...";
    }
    
}
