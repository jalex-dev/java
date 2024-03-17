package com.krakedev;


/**
 * comentario de varias lineas
 */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;//1. Declaro una variablr de tipo Persona
		p= new Persona(); //2)Instaciar un objeto Persona, referenciarlo con p
		Persona p2 = new Persona();
		
		System.out.println("Nombre: "+ p.nombre);
		System.out.println("Edad :" + p.edad);
		System.out.println("Estatura: "+ p.estatura);
		
		System.out.println("--------------------");
		
		p.nombre = "Mario";
		p.edad = 23;
		p.estatura = 1.64;
		
		System.out.println("Nombre: "+ p.nombre);
		System.out.println("Edad :" + p.edad);
		System.out.println("Estatura: "+ p.estatura);
		
		p2.nombre = "Angelica";
		
		System.out.println("***********");
		System.out.println("p.nombre: "+ p.nombre);
		System.out.println("p2.nombre: "+p2.nombre);

	}

}
