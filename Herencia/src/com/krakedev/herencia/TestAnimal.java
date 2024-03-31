package com.krakedev.herencia;

public class TestAnimal {
	public static void main(String[] args) {
		Gato g = new Gato();
		g.dormir();
		
		// Invocar al método maullar sin parámetros
        g.maullar();

        // Invocar al método maullar con un adjetivo
        g.maullar("fuerte");
	}

}
