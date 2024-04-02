package com.krakedev.persistencia.test;

import java.sql.SQLException;

import com.krakedev.persistencia.servicios.AdminEstudianteProfesor;

public class TestMetodoEliminar {

	public static void main(String[] args) {

		// Prueba de eliminación de Profesor
        System.out.println("Eliminación de Profesor:");
        int codigoProfesor = 4000;
        try {
            AdminEstudianteProfesor.deleteProfesor(codigoProfesor);
            System.out.println("Profesor eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar profesor: " + e.getMessage());
        }

        // Prueba de eliminación de Estudiante
        
        System.out.println("\nEliminación de Estudiante:");
        String cedulaEstudiante = "2400286437";
        try {
        	AdminEstudianteProfesor.deleteEstudiante(cedulaEstudiante);
            System.out.println("Estudiante eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
        }
	}

}
