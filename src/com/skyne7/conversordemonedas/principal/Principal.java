package com.skyne7.conversordemonedas.principal;

import com.skyne7.conversordemonedas.modelos.ConsultaTasasDeConversion;
import com.skyne7.conversordemonedas.modelos.Conversor;
import com.skyne7.conversordemonedas.modelos.Tasas;
import com.skyne7.conversordemonedas.modelos.TasasExchangeRate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Conversor miConversor = new Conversor();
        miConversor.eleccion();
    }
}
