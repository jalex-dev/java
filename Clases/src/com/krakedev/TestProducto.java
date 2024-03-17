/**
 * 
 */
package com.krakedev;

/**
 * 
 */
public class TestProducto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;

		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		//modifica el productoA
		productoA.nombre = "Paracetamol";
        productoA.descripcion = "Analgesico y antifebril";
        productoA.precio = 5.99;
        productoA.stockActual = 100;
        //modifica el productoB
        
        productoB.nombre = "Ibuprofeno";
        productoB.descripcion = "Antiinflamatorio";
        productoB.precio = 7.5;
        productoB.stockActual = 75;
        //modifica el productoC
        
        productoC.nombre = "Vitamina C";
        productoC.descripcion = "Suplemento vitamínico";
        productoC.precio = 8.49;
        productoC.stockActual = 50;
        
        System.out.println("---------------Producto A------------------");
        System.out.println("Nombre: "+productoA.nombre);
        System.out.println("Descripción: "+productoA.descripcion);
        System.out.println("Precio: "+productoA.precio);
        System.out.println("Stock: "+productoA.stockActual);

        System.out.println("---------------Producto B------------------");
        System.out.println("Nombre: "+productoB.nombre);
        System.out.println("Descripción: "+productoB.descripcion);
        System.out.println("Precio: "+productoB.precio);
        System.out.println("Stock: "+productoB.stockActual);

        System.out.println("---------------Producto C------------------");
        System.out.println("Nombre: "+productoC.nombre);
        System.out.println("Descripción: "+productoC.descripcion);
        System.out.println("Precio: "+productoC.precio);
        System.out.println("Stock: "+productoC.stockActual);

	}

}
