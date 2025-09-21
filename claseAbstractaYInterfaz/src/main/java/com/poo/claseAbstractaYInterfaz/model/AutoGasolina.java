package com.poo.claseAbstractaYInterfaz.model;

/**
 *
 * @author Joaquin
 */
public class AutoGasolina extends Vehiculo implements Gasolina{

    public AutoGasolina(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }
    // Metodo abstracto implementado
    @Override
    public double impuesto() {
        return 825.98;
    }
    // Metodo de la interfaz implementado
    @Override
    public String recargar() {
        return "Recargando gasolina...";
    }
    
}
