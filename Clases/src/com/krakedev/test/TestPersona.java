package com.krakedev.test;

import com.krakedev.Persona;

/**
 * comentario de varias lineas
 */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;//1. Declaro una variablr de tipo Persona
		p= new Persona(); //2)Instaciar un objeto Persona, referenciarlo con p
		Persona p2 = new Persona();
		Persona p3 = new Persona("Joao");
		Persona p4 = new Persona("Alex", 52, 1.70);
		
		System.out.println("Nombre: "+ p4.getNombre());
		System.out.println("Edad :" + p4.getEdad());
		System.out.println("Estatura: "+ p4.getEstatura());
		
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
