package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//modificar los atributos del objeto auto1
		auto1.setMarca("Mazda");
		auto1.setAnio(2007);
		auto1.setPrecio(56654.0);
		//modificalr los atributos del objetos auto2
		auto2.setMarca("Toyota");
		auto2.setAnio(2017);
		auto2.setPrecio(1500);
		
		
		System.out.println("--------Auto 1----------");
		System.out.println("Marca: "+ auto1.getMarca());
		System.out.println("Año: "+ auto1.getAnio());
		System.out.println("Precio: "+ auto1.getPrecio());

		
		System.out.println("--------Auto 2----------");
		System.out.println("Marca: "+ auto2.getMarca());
		System.out.println("Año: "+ auto2.getAnio());
		System.out.println("Precio: "+ auto2.getPrecio());
	}

}
