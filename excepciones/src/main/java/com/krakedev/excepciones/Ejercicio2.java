package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a = null;
		a.substring(1);
		// NPE Unckecked no exige una exepciomn
	}

	public void metodo2() {

		File f = new File("archivo1.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error");
		} // IOException ckecked

	}

	public void metodo3() throws IOException {

		File f = new File("archivo1.txt");
		f.createNewFile(); // IOException ckecked

	}
	

}
