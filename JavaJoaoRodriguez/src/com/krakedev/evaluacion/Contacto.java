package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	// Constructor
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();

	}

	// Getter para cédula
	public String getCedula() {
		return cedula;
	}

	// Setter para cédula
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	// Getter para nombre
	public String getNombre() {
		return nombre;
	}

	// Setter para nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter para apellido
	public String getApellido() {
		return apellido;
	}

	// Setter para apellido
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// Getter para dirección
	public Direccion getDireccion() {
		return direccion;
	}

	// Setter para dirección
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	// Getter y setter para teléfonos
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	// Método para imprimir la información del contacto
	public void imprimir() {
		System.out.println("Cédula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		if (direccion != null) {
			System.out.println("Dirección:");
			System.out.println("   Calle Principal: " + direccion.getCallePrincipal());
			System.out.println("   Calle Secundaria: " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}
	}

	// Método para imprimir la información del contacto
	public void imprimirModificado() {
		System.out.println("***" + nombre + " " + apellido + "****");
		if (direccion != null) {
			System.out.println("Dirección: " + direccion.getCallePrincipal() + " " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}

	}

	// Método para agregar un teléfono a la lista
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	// Método para mostrar los teléfonos con estado "C"
	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C'");
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("C")) {
				System.out.println("Número: " + telefono.getNumero() + ", Tipo: " + telefono.getTipo());
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> incorrectos = new ArrayList<>();
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("E")) {
				incorrectos.add(telefono);
			}
		}
		return incorrectos;
	}
}
