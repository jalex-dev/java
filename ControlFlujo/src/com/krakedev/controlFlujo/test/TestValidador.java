package com.krakedev.controlFlujo.test;

import com.krakedev.controlFlujo.Validador;

public class TestValidador {
	public static void main(String[] args) {
		Validador validador = new Validador();
		
		validador.validadEdad(10);
		validador.validadEdad(18);
		validador.validadEdad(56);
	}
}
