package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// Crear una máquina de dulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Agregar celdas a la máquina
        maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));
        
        // Cargar productos en algunas celdas
        Producto producto1 = new Producto("KE34", "Papitas", 0.85);
        maquina.cargarProducto(producto1, "B1", 4);

        Producto producto2 = new Producto("D456", "Doritos", 0.5);
        maquina.cargarProducto(producto2, "A1", 6);
        
        Producto producto3 = new Producto("KE54", "Jet", 0.25);
        maquina.cargarProducto(producto3, "B2", 4);

        Producto producto4 = new Producto("D436", "DeTodito", 0.60);
        maquina.cargarProducto(producto4, "A2", 6);
        
        Producto producto5 = new Producto("ME34", "Coca cola 1L", 1.85);
        maquina.cargarProducto(producto5, "C1", 4);

        Producto producto6 = new Producto("W456", "Tony", 1.8);
        maquina.cargarProducto(producto6, "C2", 6);



        // Definir el límite de precio
        double limite = 1.0;
        
        // Buscar productos con precio menor o igual al límite
        ArrayList<Producto> productosEncontrados = maquina.buscarMenores(limite);

        // Imprimir los productos encontrados
        System.out.println("Productos con precio menor o igual a $" + limite + ":");
        System.out.println("Productos Menores:" + productosEncontrados.size());
        for (Producto producto : productosEncontrados) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }
	}

}
