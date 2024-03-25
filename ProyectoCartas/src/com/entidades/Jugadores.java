package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {

	private ArrayList<String> jugadores;

	// Constructor
	public Jugadores() {
		jugadores = new ArrayList<String>();
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	// Método para jugar
	public void jugar() {
		// Agregar tres jugadores
		jugadores.add("Jugador 1");
		jugadores.add("Jugador 2");
		jugadores.add("Jugador 3");

		// Crear un objeto de la clase Juego con los jugadores
        Juego juego = new Juego(jugadores);

		// Entregar cartas a cada jugador
		juego.entregarCartas(5);

		// Mostrar resultados
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println("Jugador " + (i + 1) + ": " + juego.devolverTotal(i)+ " cartas");
		}

		// Determinar el ganador
		String ganador = juego.determinarGanador();
		System.out.println("El ganador es: " + ganador);
	}

	
}
