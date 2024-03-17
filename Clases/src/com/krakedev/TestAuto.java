package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//modificar los atributos del objeto auto1
		auto1.marca= "Mazda";
		auto1.anio= 2007;
		auto1.anio = 5000;
		//modificalr los atributos del objetos auto2
		auto2.marca= "Toyota";
		auto2.anio= 2017;
		auto2.anio = 1500;
		
		
		System.out.println("--------Auto 1----------");
		System.out.println("Marca: "+ auto1.marca);
		System.out.println("Año: "+ auto1.anio);
		System.out.println("Marca: "+ auto1.precio);

		
		System.out.println("--------Auto 2----------");
		System.out.println("Marca: "+ auto2.marca);
		System.out.println("Año: "+ auto2.anio);
		System.out.println("Marca: "+ auto2.precio);
	}

}
