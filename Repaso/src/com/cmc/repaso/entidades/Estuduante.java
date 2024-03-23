package com.cmc.repaso.entidades;

public class Estuduante {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	
	public Estuduante(String nombre) {
		this.nombre = nombre;
	
	}
	
	public void calificar(double nota) {
		this.nota = nota;
		if(nota <8) {
			resultado = "F";
		}else if(nota>=8) {
			resultado ="A";
		}
		
	}
	
	public void imprimir() {
		System.out.println("*******Datos del Estuduante");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Nota: "+nota);
		System.out.println("Resultado: "+ resultado);
	}
	

}
