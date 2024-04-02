package com.krakedev.persistencia.test;

import java.sql.SQLException;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {

		 String cedulaToDelete = "2400286534"; // Replace with actual cedula to delete

	        System.out.println("Eliminando persona con cédula: " + cedulaToDelete);
	        try {
				AdminPersonas.eliminar(cedulaToDelete);
	            System.out.println("Persona eliminada exitosamente");
			} catch (SQLException e) {
	            System.out.println("Error: La persona no fue eliminada correctamente");
			}
	}

}
