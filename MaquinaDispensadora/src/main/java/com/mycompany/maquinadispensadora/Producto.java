package com.mycompany.maquinadispensadora;

public class Producto {
    
    protected String nombre;
    protected int precio;
    protected int codigo;

    public Producto(String nombre, int precio, int codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
}