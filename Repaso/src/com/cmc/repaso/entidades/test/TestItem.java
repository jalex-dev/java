package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {

		 // Crear un objeto de tipo Item
        Item producto1 = new Item("Cuadernos", 20, 0, 0);
        Item producto2 = new Item("Lapiz", 30, 0, 0);


        // Imprimir los atributos iniciales
        System.out.println("Estado inicial del ítem:");
        producto1.imprimir();

        // Vender productos
        producto1.vender(10);
        producto1.imprimir();

        // Devolver productos
        producto1.devolver(5);
        producto1.imprimir();
        
        // Imprimir los atributos iniciales
        System.out.println("Estado inicial del ítem:");
        producto2.imprimir();

        // Vender productos
        producto2.vender(10);
        producto2.imprimir();

        // Devolver productos
        producto2.devolver(5);
        producto2.imprimir();
	}

}
