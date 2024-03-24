package com.cmc.directorio.entidades;

public class Contacto {
	private String nombre;
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	
	public void imprimir() {
	    System.out.println("Nombre: " + nombre);
	    System.out.println("Apellido: " + apellido);
	    System.out.println("Activo: " + (activo ? "Sí" : "No"));
	    
	    if (telefono != null) {
	        System.out.println("Teléfono: " + telefono.getNumero()+ " Operadora: " + telefono.getOperadora()+" Codigo: "+telefono.getCodigo());
	    } else {
	        System.out.println("No se ha proporcionado información de teléfono para este contacto.");
	    }
	    
	    System.out.println("Peso: " + peso + " kg");
	}
	
}

