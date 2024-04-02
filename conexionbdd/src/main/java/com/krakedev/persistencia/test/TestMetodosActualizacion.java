package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Profesor;
import com.krakedev.persistencia.servicios.AdminEstudianteProfesor;
import com.krakedev.persistencia.utils.Utilitario;

public class TestMetodosActualizacion {

	public static void main(String[] args) {

		// Prueba de actualización de Profesor
        System.out.println("Actualización de Profesor:");
        Profesor profesor = new Profesor(4000, "Nuevo nombre", new BigDecimal("1500.00"));
        try {
            AdminEstudianteProfesor.updateProfesor(profesor);
            System.out.println("Profesor actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar profesor: " + e.getMessage());
        }
        Date fechaEstudiante = null;
        // Prueba de actualización de Estudiante
		try {
			fechaEstudiante = Utilitario.convertirAFechaUtil("2020/03/22");
		} catch (Exception e) {
			System.out.println("Error al sitema "+ e.getMessage());
		}

        System.out.println("\nActualización de Estudiante:");
        Estudiante estudiante = new Estudiante("2400286437", "Nuevo nombre", "Nuevo apellido", "nuevo@gmail.com",
        		fechaEstudiante, profesor);
        try {
        	AdminEstudianteProfesor.updateEstudiante(estudiante);
            System.out.println("Estudiante actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar estudiante: " + e.getMessage());
        }
    }
	

}
