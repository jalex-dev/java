package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.ConxionBDD;
import com.krakedev.persistencia.utils.Utilitario;

public class TestAdminPersona {

	public static void main(String[] args) {
		Date fechaNacimiento = null;
		Date horaNacimiento = null;
		try {
			fechaNacimiento = Utilitario.convertirAFechaUtil("2020/03/22");
			horaNacimiento = Utilitario.convertirAHoraUtil("10:34:32");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			//LOGGER.error(e.getMessage(),e);
			System.out.println("Error al sitema "+ e.getMessage());
		}
		Persona persona = new Persona("2400286534", "Julio Alex", "Rodriguez Casillo",
                new EstadoCivil("S","Soltero"), 3, 1.60, new BigDecimal("1200.56"),
               fechaNacimiento , horaNacimiento);

		try {
			AdminPersonas.insert(persona);
		} catch (SQLException e) {
			
			System.out.println("Error al sitema "+ e.getMessage());
		}
	}

}
