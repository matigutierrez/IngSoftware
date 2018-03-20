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

    private void dispensarDinero(int dinero) {
        System.out.println("Su vuelto es de $" + dinero);
    }

    public void dispensarProducto(ArrayList<Producto> productos) {
        Calculadora calculadora = new Calculadora();
        int dineroreciv = recibirDinero();
        int codproducto = seleccionarProducto();

        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCodigo() == codproducto){
                this.dinero = calculadora.suma(this.dinero, dineroreciv);
                this.dinero = calculadora.resta(dineroreciv, productos.get(i).getPrecio());
                dispensarDinero(calculadora.resta(dineroreciv, productos.get(i).getPrecio()));
                productos.remove(i);
                break;
            }
        }
    }

    private int recibirDinero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Dinero");
        int monto = Integer.parseInt(entrada.nextLine());

        return monto;
    }

    private int seleccionarProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el Codigo \n 1.-Super8 2.- Golazo 3.-Chocman");
        int codproducto = Integer.parseInt(entrada.nextLine());

        return codproducto;
    }

    public void verProductos(ArrayList<Producto> productos) {

        for (int i = 0; i < productos.size(); i++) {
            System.out.println("-" + productos.get(i).getNombre() + "-" + productos.get(i).getPrecio() + "-" + productos.get(i).getCodigo());
        }
    }
}