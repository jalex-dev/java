package com.krakedev.coleciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	public AdminPersonas() {
		this.personas = new ArrayList<Persona>();
	}

	public void agregar(Persona persona) {
		personas.add(persona);
	}
	public void imprimir() {
		Persona elementoPersona;
		for(int i = 0; i <personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println("Persona: "+ elementoPersona.getNombre()+" "+elementoPersona.getEdad());
		}
	}
	public Persona buscarPorNombre(String nombre) {
	    for (Persona persona : personas) {
	        if (persona.getNombre().equalsIgnoreCase(nombre)) {
	            return persona; // Retorna la primera persona encontrada con ese nombre
	        }
	    }
	    return null; // Retorna null si no se encuentra ninguna persona con ese nombre
	}
	 // Método para buscar personas cuya edad sea mayor que la edad especificada
    public ArrayList<Persona> buscarMayores(int edad) {
    	ArrayList<Persona> personasMayores = new ArrayList<Persona>();
        for (Persona persona : personas) {
            if (persona.getEdad() > edad) {
                personasMayores.add(persona);
            }
        }
        return personasMayores;
    }
}
