package com.cmc.repaso.entidades;

public class Producto {

	private String nombre;
	private double precio;
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	
	public void setPrecio(double precio) {
		if (precio < 0) {
	        this.precio = precio * -1; // Multiplica por -1 para hacerlo positivo
	    } else {
	        this.precio = precio; // Deja el precio como está si es positivo
	    }
	}
	
	public double calcularPrecioPromo(double porcentajeDescuento) {
	    // Calcula el descuento
	    double descuento = precio * (porcentajeDescuento / 100);
	    
	    // Calcula el precio con el descuento aplicado
	    double precioConDescuento = precio - descuento;
	    
	    return precioConDescuento;
	}
	
	
	public void imprimir() {
		System.out.println("*************Detalle de Producto********");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Precio: "+precio);
	}
	
}
