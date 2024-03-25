package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero>numerosPosibles;
	private ArrayList<Carta> cartas;
    private Palo palo;

	// Constructor
	public Naipe() {
		numerosPosibles = new ArrayList<>();
		cartas = new ArrayList<>();
        palo = new Palo(); // Crear un objeto de la clase Palo

		// Agregar los 13 números posibles al naipe
		String[] numeros = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int[] valores = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		for (int i = 0; i < numeros.length; i++) {
			Numero numero = new Numero(numeros[i], valores[i]);
			numerosPosibles.add(numero);
		}
		// Agregar las 52 cartas al naipe
        for (Numero numero : numerosPosibles) {
            // Obtener los palos de la clase Palo
            String corazonRojo = palo.getCorazonRojo();
            String corazonNegro = palo.getCorazonNegro();
            String diamante = palo.getDiamante();
            String trebol = palo.getTrebol();

            // Agregar las cartas para cada palo
            Carta carta1 = new Carta(numero, corazonRojo);
            Carta carta2 = new Carta(numero, corazonNegro);
            Carta carta3 = new Carta(numero, diamante);
            Carta carta4 = new Carta(numero, trebol);

            // Agregar las cartas a la lista de cartas del naipe
            cartas.add(carta1);
            cartas.add(carta2);
            cartas.add(carta3);
            cartas.add(carta4);
        }
	}

	// Getter para las cartas
	public ArrayList<Carta> getCartas() {
		return cartas;
		
	} 
	
	
	// Método para barajar las cartas del naipe
    public ArrayList<Carta> barajar() {
        ArrayList<Carta> auxiliar = new ArrayList<>();
        
        // Crear una copia de las cartas originales
        for (Carta carta : cartas) {
            auxiliar.add(new Carta(carta.getNumero(), carta.getPalo())); // Crear una nueva carta con los mismos valores
        }

        // Barajar las cartas
        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion(); // Obtener una posición aleatoria
            Carta carta = auxiliar.get(posicion); // Obtener la carta en la posición aleatoria
            if (carta.getEstado().equals("N")) { // Verificar el estado de la carta
                carta.setEstado("C"); // Cambiar el estado de la carta a "C"
            }
        }

        // Agregar las cartas restantes al arreglo auxiliar
        for (Carta carta : auxiliar) {
            if (carta.getEstado().equals("N")) {
                carta.setEstado("C"); // Cambiar el estado de la carta a "C" ya que se agregará al arreglo auxiliar
            }
        }

        return auxiliar;
    }
	
	
}
