package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Profesor;
import com.krakedev.persistencia.servicios.AdminEstudianteProfesor;

public class TestInsertProfesorEstudiante {

	public static void main(String[] args) {
	
		 // Crear un objeto Profesor de prueba
        Profesor profesor = new Profesor(4000, "Joao Alex Rodriguez Castillo", new BigDecimal("1200.56"));
        
        // Crear un objeto Estudiante de prueba
        Estudiante estudiante = new Estudiante("2400286437", "Roberto", "Rodriguez", "hola@gmail.com",
                                                new Date(), profesor);
        
        try {
            // Intentar insertar el profesor y verificar si se realizó correctamente
            AdminEstudianteProfesor.insertProfesor(profesor);
            System.out.println("Insercion exitosa de profesor");
            // Intentar insertar el estudiante y verificar si se realizó correctamente
            AdminEstudianteProfesor.insertEstudiante(estudiante);
            System.out.println("Insercion exitosa  de estudiantes");
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
	}

}
