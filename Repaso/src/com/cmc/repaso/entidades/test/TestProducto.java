package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Torta", 10);
		double precioConDescuento = p1.calcularPrecioPromo(5);
		
		
		p1.imprimir();
		System.out.println("Precio con Descuento: "+ precioConDescuento);
		
		Producto p2 = new Producto("Gorras", 0);
		
		p2.setPrecio(-89);
		
		p2.imprimir();
		
	}

}
