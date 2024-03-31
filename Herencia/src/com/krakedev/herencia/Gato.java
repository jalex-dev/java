package com.krakedev.herencia;

public class Gato extends Animal {
	@Override
	public void dormir() {
		System.out.println("Gato tomando una siesta");
	}
	
	public void maullar() {
		System.out.println("Gatito maullando ... miauuuuu!");
	}
	
	// Método maullar sobrecargado con un adjetivo
    public void maullar(String adjetivo) {
        System.out.println("¡Gato maullando " + adjetivo + "!");
    }

}
