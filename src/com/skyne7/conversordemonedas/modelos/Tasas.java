package com.skyne7.conversordemonedas.modelos;

import java.util.Map;

public class Tasas {
    Map<String, Double> tasasDeConversion;

    public Tasas(TasasExchangeRate tasasExchangeRate) {
        this.tasasDeConversion = tasasExchangeRate.conversion_rates();
    }

    public double convertir(String clave, Double cantidad){
       return tasasDeConversion.get(clave) * cantidad;
    }

    public Map<String, Double> getTasasDeConversion() {
        return tasasDeConversion;
    }
}
