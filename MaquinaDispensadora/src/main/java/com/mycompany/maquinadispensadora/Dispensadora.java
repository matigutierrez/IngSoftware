package com.mycompany.maquinadispensadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Dispensadora {
    
    private String marca;
    private int dinero;

    public Dispensadora(String marca, int dinero) {
        this.marca = marca;
        this.dinero = dinero;
    }

    public void dispensarDinero(int dinero) {
        System.out.println("Su vuelto es de $" + dinero);
    }

    public void dispensarProducto(ArrayList<Producto> productos) {
        Calculadora calculadora = new Calculadora();
        int dineroreciv = recibirDinero();
        int codproducto = seleccionarProducto();

        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).codigo == codproducto){
                this.dinero = calculadora.suma(this.dinero, dineroreciv);
                this.dinero = calculadora.resta(dineroreciv, productos.get(i).precio);
                dispensarDinero(calculadora.resta(dineroreciv, productos.get(i).precio));
                productos.remove(i);
                break;
            }
        }
    }

    public int recibirDinero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto");
        int monto = entrada.nextInt();

        return monto;
    }

    public int seleccionarProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Codigo");
        int codproducto = entrada.nextInt();

        return codproducto;
    }

    public void verProductos(ArrayList<Producto> productos) {

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).nombre);
        }
    }
}