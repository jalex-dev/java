package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Validaciones;

public class TestValidacion {

	public static void main(String[] args) {
		
		Validaciones v1 = new Validaciones();
		boolean validaMonto = v1.validarMonto(34);
		if(validaMonto) {
			System.out.println("Monto Valido");
		}else {
			System.out.println("Monto invalido");
		}
	}

}
