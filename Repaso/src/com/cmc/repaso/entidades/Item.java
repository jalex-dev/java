package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) {
        this.nombre = nombre;
        this.productosActuales = productosActuales;
        this.productosDevueltos = productosDevueltos;
        this.productosVendidos = productosVendidos;
    }
    
    // Método para imprimir los atributos en consola
    public void imprimir() {
        System.out.println("Nombre del ítem: " + nombre);
        System.out.println("Productos Actuales: " + productosActuales);
        System.out.println("Productos Devueltos: " + productosDevueltos);
        System.out.println("Productos Vendidos: " + productosVendidos);
    }
    
 // Método para vender productos
    public void vender(int cantidad) {
        if (cantidad <= productosActuales) {
            productosActuales -= cantidad;
            productosVendidos += cantidad;
            System.out.println(cantidad + " productos de " + nombre + " vendidos.");
        } else {
            System.out.println("No hay suficientes productos de " + nombre + " disponibles para vender.");
        }
    }
    // Método para devolver productos vendidos
    public void devolver(int cantidad) {
        if (cantidad <= productosVendidos) {
            productosActuales += cantidad;
            productosDevueltos += cantidad;
            productosVendidos -= cantidad;
            System.out.println(cantidad + " productos de " + nombre + " devueltos.");
        } else {
            System.out.println("No se pueden devolver más productos de " + nombre + " de los que se han vendido.");
        }
    }

}
