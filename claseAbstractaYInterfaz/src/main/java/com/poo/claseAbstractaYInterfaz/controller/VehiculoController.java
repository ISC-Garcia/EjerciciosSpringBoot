package com.poo.claseAbstractaYInterfaz.controller;

import com.poo.claseAbstractaYInterfaz.model.AutoElectrico;
import com.poo.claseAbstractaYInterfaz.model.AutoGasolina;
import com.poo.claseAbstractaYInterfaz.model.Electrico;
import com.poo.claseAbstractaYInterfaz.model.Gasolina;
import com.poo.claseAbstractaYInterfaz.model.Vehiculo;
import com.poo.claseAbstractaYInterfaz.model.VehiculoDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Joaquin
 */
@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
    private List<String> lista = new ArrayList<>();
    @PostMapping("/agregarElectrico")
    public void agregarElectrico(@RequestBody VehiculoDTO datos){
        Vehiculo carrito = new AutoElectrico(datos.getMarca(), datos.getModelo(), datos.getAnio());
        lista.add(carrito.descripcion() + " - Impuesto: " + carrito.impuesto() + " - " + ((Electrico) carrito).recargar());
    }
    @PostMapping("/agregarGasolina")
    public void agregarGasolina(@RequestBody VehiculoDTO datos){
        Vehiculo carrito = new AutoGasolina(datos.getMarca(), datos.getModelo(), datos.getAnio());
        lista.add(carrito.descripcion() + " - Impuesto: " + carrito.impuesto() + " - " + ((Gasolina) carrito).recargar());
    }
    @PostMapping("/verCarros")
    public List<String> verCarros(){
        return lista;
    }
}
