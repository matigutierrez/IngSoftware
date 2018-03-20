package com.mycompany.maquinadispensadora;

public class Producto {
    
    private String nombre;
    private int precio;
    private int codigo;

    public Producto(String nombre, int precio, int codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
}