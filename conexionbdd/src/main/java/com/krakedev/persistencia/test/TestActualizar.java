package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Utilitario;

public class TestActualizar {

	public static void main(String[] args) {
		Date fechaNacimiento = null;
		Date horaNacimiento = null;
		
        String nuevaCedula = "1234567890";
        String nuevoNombre = "Maria";
        int nuevosHijos = 2;

        try {
			fechaNacimiento = Utilitario.convertirAFechaUtil("2020/03/22");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			horaNacimiento = Utilitario.convertirAHoraUtil("10:34:32");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        Persona personaToUpdate = new Persona("2400286534", "Julio Alex", "Rodriguez Casillo",
                new EstadoCivil("S", "Soltero"), 3, 1.60, new BigDecimal("1200.56"),
                fechaNacimiento, horaNacimiento);

        personaToUpdate.setNombre(nuevoNombre);
		personaToUpdate.setNumeroHijos(nuevosHijos);

		System.out.println("\nActualizando persona:");
		try {
			AdminPersonas.actualizar(personaToUpdate);
		} catch (SQLException e) {
			System.out.println("Error al sitema "+ e.getMessage());
			
		}
	}

}
