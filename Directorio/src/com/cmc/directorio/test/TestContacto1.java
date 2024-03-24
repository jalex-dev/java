package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
	public static void main(String[] args) {

		Telefono telf = new Telefono("movi", "09941234123", 10);
		Contacto c = new Contacto("Joao", "Rodriguez", telf, 6.3);

		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Activo: " + (c.isActivo() ? "Sí" : "No"));

		System.out.println("Teléfono: " + telf.getNumero() + " Operadora: " + telf.getOperadora());

		System.out.println("Peso: " + c.getPeso() + " kg");

	}

}
