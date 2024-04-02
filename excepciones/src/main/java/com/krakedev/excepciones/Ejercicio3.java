package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Ejercicio3 {
	private static final Logger LOGGER = LogManager.getLogger(Ejercicio3.class);

	public void metodo1() {
		String a = null;
		try {
			a.substring(1);
		// NPE Unckecked no exige una exepciomn
		} catch (Exception e) {
			System.out.println("Error");
			LOGGER.error("Error al obtener la subcadena: "+ e.getMessage());

		}
		
	}
	public void metodo11() {

		File f = new File("archivo1.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error");
		} // IOException ckecked

	}
	public static void main(String[] args) {
		Ejercicio3 ej3= new Ejercicio3();
		ej3.metodo1();
	}
}
