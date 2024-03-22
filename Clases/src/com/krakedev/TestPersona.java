package com.krakedev;


/**
 * comentario de varias lineas
 */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;//1. Declaro una variablr de tipo Persona
		p= new Persona(); //2)Instaciar un objeto Persona, referenciarlo con p
		Persona p2 = new Persona();
		
		System.out.println("Nombre: "+ p.getNombre());
		System.out.println("Edad :" + p.getEdad());
		System.out.println("Estatura: "+ p.getEstatura());
		
		System.out.println("--------------------");
		
		p.setNombre("Mario");
		p.setEdad(23);
		p.setEstatura(1.64);
		
		System.out.println("Nombre: "+ p.getNombre());
		System.out.println("Edad :" + p.getEdad());
		System.out.println("Estatura: "+ p.getEstatura());
		
		p2.setNombre("Angelica");
		
		System.out.println("***********");
		System.out.println("p.nombre: "+ p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());

	}

}
