package com.skyne7.conversordemonedas.modelos;

import java.util.Scanner;

public class Conversor {
    public void exhibirMenu(){
        System.out.println("""
               *************************************************
                
               Bienvenido/a al Conversor de Moneda
               
               1) Dólar =>> Peso Argentino
               2) Peso argentino =>> Dólar 
               3) Dólar =>> Real Brasileño
               4) Real Brasileño =>> Dólar
               5) Dólar =>> Peso Colombiano
               6) Peso Colombiano =>> Dólar
               7 Salir
               
               Elija una opción válida: 
               ***************************************************
                """);
    }
        public void eleccion(){
        Scanner teclado = new Scanner(System.in);
        String opcion = "0";
        Boolean salir = false;
        double cantidad;
        ConsultaTasasDeConversion consulta = new ConsultaTasasDeConversion();
        Conversor menu = new Conversor();
        while(opcion != "7" && salir == false) {
            menu.exhibirMenu();
            opcion = teclado.next();
            String ars;
            String tipo;
            switch (opcion) {
                case "1":
                    ars = "ARS";
                    TasasExchangeRate tasasExchangeRate = consulta.tipo(tipo = "USD");
                    Tasas miTasa = new Tasas(tasasExchangeRate);
                    System.out.println("Ingresa el valor que deseas convertir");
                    cantidad = teclado.nextDouble();
                    System.out.println("El valor de " + cantidad + "["+tipo+"]" + " corresponde al valor " +
                            "final de =>>> " + miTasa.convertir(ars, cantidad) + "["+ars+"]");
                    break;
                case "2":
                    ars = "USD";
                    tasasExchangeRate = consulta.tipo(tipo = "ARS");
                    miTasa = new Tasas(tasasExchangeRate);
                    System.out.println("Ingresa el valor que deseas convertir");
                    cantidad = teclado.nextDouble();
                    System.out.println("El valor de " + cantidad + "["+tipo+"]" + " corresponde al valor " +
                            "final de =>>> " + miTasa.convertir(ars, cantidad) + "["+ars+"]");
                    break;
                case "3":
                    ars = "BRL";
                    tasasExchangeRate = consulta.tipo(tipo = "USD");
                    miTasa = new Tasas(tasasExchangeRate);
                    System.out.println("Ingresa el valor que deseas convertir");
                    cantidad = teclado.nextDouble();
                    System.out.println("El valor de " + cantidad + "["+tipo+"]" + " corresponde al valor " +
                            "final de =>>> " + miTasa.convertir(ars, cantidad) + "["+ars+"]");
                    break;
                case "4":
                    ars = "USD";
                    tasasExchangeRate = consulta.tipo(tipo = "BRL");
                    miTasa = new Tasas(tasasExchangeRate);
                    System.out.println("Ingresa el valor que deseas convertir");
                    cantidad = teclado.nextDouble();
                    System.out.println("El valor de " + cantidad + "["+tipo+"]" + " corresponde al valor " +
                            "final de =>>> " + miTasa.convertir(ars, cantidad) + "["+ars+"]");
                    break;
                case "5":
                    ars = "COP";
                    tasasExchangeRate = consulta.tipo(tipo = "USD");
                    miTasa = new Tasas(tasasExchangeRate);
                    System.out.println("Ingresa el valor que deseas convertir");
                    cantidad = teclado.nextDouble();
                    System.out.println("El valor de " + cantidad + "["+tipo+"]" + " corresponde al valor " +
                            "final de =>>> " + miTasa.convertir(ars, cantidad) + "["+ars+"]");
                    break;
                case "6":
                    ars = "USD";
                    tasasExchangeRate = consulta.tipo(tipo = "COP");
                    miTasa = new Tasas(tasasExchangeRate);
                    System.out.println("Ingresa el valor que deseas convertir");
                    cantidad = teclado.nextDouble();
                    System.out.println("El valor de " + cantidad + "["+tipo+"]" + " corresponde al valor " +
                            "final de =>>> " + miTasa.convertir(ars, cantidad) + "["+ars+"]");
                    break;
                case "7":
                    salir = true;
                    System.out.println("saliendo del sistema de conversion de divisas...");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }
        }
    }
}
