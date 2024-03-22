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
		productoA.setNombre("Paracetamol");
        productoA.setDescripcion("Analgesico y antifebril");
        productoA.setPrecio(5.99);
        productoA.setStockActual(100);
        //modifica el productoB
        
        productoB.setNombre("Ibuprofeno");
        productoB.setDescripcion("Antiinflamatorio");
        productoB.setPrecio(7.5);
        productoB.setStockActual(75);
        //modifica el productoC
        
        productoC.setNombre("Vitamina C");
        productoC.setDescripcion("Suplemento vitamínico");
        productoC.setPrecio(8.49);
        productoC.setStockActual(50);
        
        System.out.println("---------------Producto A------------------");
        System.out.println("Nombre: "+productoA.getNombre());
        System.out.println("Descripción: "+productoA.getDescripcion());
        System.out.println("Precio: "+productoA.getPrecio());
        System.out.println("Stock: "+productoA.getStockActual());

        System.out.println("---------------Producto B------------------");
        System.out.println("Nombre: "+productoB.getNombre());
        System.out.println("Descripción: "+productoB.getDescripcion());
        System.out.println("Precio: "+productoB.getPrecio());
        System.out.println("Stock: "+productoB.getStockActual());

        System.out.println("---------------Producto C------------------");
        System.out.println("Nombre: "+productoC.getNombre());
        System.out.println("Descripción: "+productoC.getDescripcion());
        System.out.println("Precio: "+productoC.getPrecio());
        System.out.println("Stock: "+productoC.getStockActual());

	}

}
