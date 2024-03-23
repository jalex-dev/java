package com.krakeded.demo.test;

import com.krakeded.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto produto1 = new Producto(25, "Margarina");
		produto1.setDescripcion("tarrina de mantillo 500g.");
		produto1.setPeso(500);
		
		System.out.println("*********PRODUCTOS**********");
		System.out.println("Nombre Producto: "+ produto1.getNombre());
		System.out.println("Codigo Producto: "+produto1.getCodigo());
		System.out.println("Descripción Producto: "+produto1.getDescripcion());
		System.out.println("Peso Producto: "+produto1.getPeso());

	}

}
