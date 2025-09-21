package com.poo.arraylistYhashset.model;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Joaquin
 */
public class Comparacion {
    private List<String> arrayList;
    private Set<String> hashSet;
    private String resultado;

    public Comparacion(List<String> arrayList, Set<String> hashSet, String resultado) {
        this.arrayList = arrayList;
        this.hashSet = hashSet;
        this.resultado = resultado;
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    public Set<String> getHashSet() {
        return hashSet;
    }

    public String getResultado() {
        return resultado;
    }
    
}
