package com.krakedev.coleciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario", "Benedetti",56));
		// Agregar personas adicionales a la lista
		admin.agregar(new Persona("Gabriel", "García Márquez", 91));
		admin.agregar(new Persona("Pablo", "Neruda", 69));
		admin.agregar(new Persona("Octavio", "Paz", 84));
		admin.agregar(new Persona("Jorge", "Luis Borges", 86));
		admin.agregar(new Persona("Gustavo", "Adolfo Bécquer", 34));
		admin.agregar(new Persona("Federico", "García Lorca", 38));
		admin.agregar(new Persona("José", "Saramago", 87));
		admin.agregar(new Persona("Julio", "Cortázar", 70));
		admin.agregar(new Persona("Isabel", "Allende", 79));
		admin.agregar(new Persona("Mario", "Vargas Llosa", 85));
		admin.imprimir();
		
		Persona personaEncontrada=admin.buscarPorNombre("maro");
		if(personaEncontrada != null) {
			System.out.println(personaEncontrada.getNombre());

		}else {
			System.out.println("Persona no encontrada");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(80);
		System.out.println("Personas Mayores: "+personasMayores.size());
	}

}
