package com.krakedev.coleciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Joao", "Rodriguez"));
		personas.add(new Persona("Alex", "Castillo"));
		personas.add(new Persona("Andres", "Ramon"));
		
		Persona elementoPersona;
		
		
		for(int i = 0;i<personas.size();i++) {
			elementoPersona= personas.get(i);
			System.out.println(elementoPersona.getNombre()+" - "+ elementoPersona.getApellido());
		}

	}

}
