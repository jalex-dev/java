package com.cmc.repaso.entidades.test;

import com.cmc.repaso.entidades.Estuduante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estuduante e1 = new Estuduante("JOAO ");
		Estuduante e2 =new Estuduante("Alex");
		e1.calificar(9);
		e2.calificar(5);
		e1.imprimir();
		e2.imprimir();
		
		
	}

}
