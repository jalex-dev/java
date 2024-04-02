package com.krakedev.excepciones;

public class ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Inicio");
		String a= "xxxs";
		try {
			System.out.println("ABRE LA CONEXION A BDD");
			a.substring(3);
			System.out.println("fin");
			System.out.println("CIERRA LA CONEXION BDD");
		} catch (Exception e) {
			System.out.println("entra al casth");
		} finally {
			System.out.println("ingresa al finally");
			System.out.println("CIERRA LA CONEXION BDD");
		}
		System.out.println("fuera del cath");

	}

}
