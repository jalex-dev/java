package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaArgumentos {

	public static void main(String[] args) {

		Persona personas= new Persona();
		try {
			personas= AdminPersonas.buscarArgumentos("Joao", "Rodriguez");
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
