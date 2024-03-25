package com.entidades;

public class Random {

	// Método estático para obtener una posición aleatoria entre 0 y 51
	public static int obtenerPosicion() {
		return (int) (Math.random() * 52); // Genera un número aleatorio entre 0 y 51 inclusive
	}
}
