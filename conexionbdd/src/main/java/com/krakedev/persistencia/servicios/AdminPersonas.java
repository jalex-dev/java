package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConxionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insert(Persona persona) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>>>> "+ persona);
		try {
			con = ConxionBDD.conectar();
			System.out.println("Insertar");
			ps = con.prepareStatement("INSERT INTO public.personas("
					+ "	cedula, nombre, apellido, estatura, estado_civil_codigo,numero_hijos,cantidad_ahorrada,fecha_nacimiento, hora_nacimiento)"
					+ "	VALUES (?, ?, ?, ?, ?,?,?,?,?);");

			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDouble(4, persona.getEstatura());
			ps.setString(5, persona.getEstadoCivil().getCodigo()); // Suponiendo que EstadoCivil tiene un método																	// getCodigo()
			ps.setInt(6, persona.getNumeroHijos());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime())); // Suponiendo que getFechaNacimiento() devuelve un objeto java.util.Date
			ps.setTime(9, new java.sql.Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate();
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
			LOGGER.error(e.getMessage(),e);
			throw e;
		} finally {
			ConxionBDD.cerrarConexion(con);
		}
	}
	/**
	 * Metodo actualizar 
	 * 
	 * @param persona
	 * @throws SQLException
	 */
	public static void actualizar(Persona persona) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a actualizar>>>>> "+ persona);
		try {
			con = ConxionBDD.conectar();
			System.out.println("Actualizar");
			
			// Se omite la columna "cedula" en la lista de campos a actualizar
			ps = con.prepareStatement("UPDATE public.personas SET "
					+ "nombre = ?, apellido = ?, estatura = ?, estado_civil_codigo = ?, numero_hijos = ?, cantidad_ahorrada = ?, fecha_nacimiento = ?, hora_nacimiento = ?"
					+ " WHERE cedula = ?;");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setDouble(3, persona.getEstatura());
			ps.setString(4, persona.getEstadoCivil().getCodigo()); // Suponiendo que EstadoCivil tiene un método getCodigo()
			ps.setInt(5, persona.getNumeroHijos());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime())); // Suponiendo que getFechaNacimiento() devuelve un objeto java.util.Date
			ps.setTime(8, new java.sql.Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula()); // Se agrega la cédula como condición WHERE para identificar el registro a actualizar
			
			ps.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error(e.getMessage(),e);
			throw e;
		} finally {
			ConxionBDD.cerrarConexion(con);
		}
	}

	/**
	 * Metodo eliminir un paersona por cedula
	 * @param cedula
	 * @throws SQLException
	 */
	public static void eliminar(String cedula) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cedula a eliminar>>>>> "+ cedula);
		try {
			con = ConxionBDD.conectar();
			System.out.println("Eliminar");
			ps = con.prepareStatement("DELETE FROM public.personas WHERE cedula = ?;");

			ps.setString(1, cedula);
			ps.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error(e.getMessage(),e);
			throw e;
		} finally {
			ConxionBDD.cerrarConexion(con);
		}
	}

}
