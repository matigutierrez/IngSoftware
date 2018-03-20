/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maquinadispensadora;

import java.util.ArrayList;

/**
 *
 * @author pguti
 */
public class Aplication {
    
    public static void main(String[] args) {
        Dispensadora dispensadora = new Dispensadora("Vilcun", 100000);
        ArrayList<Producto> productos = new ArrayList();
        productos.add(new Producto("Super 8", 300, 1));
        productos.add(new Producto("Super 8", 300, 1));
        productos.add(new Producto("Super 8", 300, 1));
        productos.add(new Producto("Golazo", 300, 2));
        productos.add(new Producto("Golazo", 300, 2));
        productos.add(new Producto("Chocman", 200, 3));
        
        dispensadora.verProductos(productos);
        
        dispensadora.dispensarProducto(productos);
        
    }
}
