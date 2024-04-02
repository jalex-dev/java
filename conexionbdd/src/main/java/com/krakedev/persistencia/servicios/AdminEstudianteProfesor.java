package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Profesor;
import com.krakedev.persistencia.utils.ConxionBDD;

public class AdminEstudianteProfesor {
	private static final Logger LOGGER = LogManager.getLogger(AdminEstudianteProfesor.class);

	public static void insertProfesor(Profesor profesor) throws SQLException {
	    Connection con = null;
	    PreparedStatement ps = null;
		LOGGER.trace("Profesor a insertar>>>>> "+ profesor);

	    try {
	        con = ConxionBDD.conectar();
	        ps = con.prepareStatement("INSERT INTO public.profesores(codigo, nombre, saldo) VALUES (?, ?, ?);");

	        ps.setInt(1, profesor.getCodigo());
	        ps.setString(2, profesor.getNombre());
	        ps.setBigDecimal(3, profesor.getSaldo());
	        
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        LOGGER.error(e.getMessage(), e);
	        throw e;
	    } finally {
	        ConxionBDD.cerrarConexion(con);
	    }
	}

	public static void insertEstudiante(Estudiante estudiante) throws SQLException {
	    Connection con = null;
	    PreparedStatement ps = null;
		LOGGER.trace("Estudiante a insertar>>>>> "+ estudiante);

	    try {
	        con = ConxionBDD.conectar();
	        ps = con.prepareStatement("INSERT INTO public.estudiantes(cedula, nombre, apellido, enail, fecha_nacimiento, codigo_profesor) VALUES (?, ?, ?, ?, ?, ?);");

	        ps.setString(1, estudiante.getCedula());
	        ps.setString(2, estudiante.getNombre());
	        ps.setString(3, estudiante.getApellido());
	        ps.setString(4, estudiante.getEmail());
	        ps.setDate(5, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
	        ps.setInt(6, estudiante.getProfesor().getCodigo());
	        
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        LOGGER.error(e.getMessage(), e);
	        throw e;
	    } finally {
	        ConxionBDD.cerrarConexion(con);
	    }
	}
	
	public static void updateProfesor(Profesor profesor) throws SQLException {
	    Connection con = null;
	    PreparedStatement ps = null;
		LOGGER.trace("Profesor actualizar>>>>> "+ profesor);

	    try {
	        con = ConxionBDD.conectar();
	        ps = con.prepareStatement("UPDATE public.profesores SET nombre = ?, saldo = ? WHERE codigo = ?");

	        ps.setString(1, profesor.getNombre());
	        ps.setBigDecimal(2, profesor.getSaldo());
	        ps.setInt(3, profesor.getCodigo());
	        
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        LOGGER.error(e.getMessage(), e);
	        throw e;
	    } finally {
	        ConxionBDD.cerrarConexion(con);
	    }
	}

	public static void updateEstudiante(Estudiante estudiante) throws SQLException {
	    Connection con = null;
	    PreparedStatement ps = null;
		LOGGER.trace("Estudiante a actualizar>>>>> "+ estudiante);

	    try {
	        con = ConxionBDD.conectar();
	        ps = con.prepareStatement("UPDATE public.estudiantes SET nombre = ?, apellido = ?, enail = ?, fecha_nacimiento = ?, codigo_profesor = ? WHERE cedula = ?");

	        ps.setString(1, estudiante.getNombre());
	        ps.setString(2, estudiante.getApellido());
	        ps.setString(3, estudiante.getEmail());
	        ps.setDate(4, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
	        ps.setInt(5, estudiante.getProfesor().getCodigo());
	        ps.setString(6, estudiante.getCedula());
	        
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        LOGGER.error(e.getMessage(), e);
	        throw e;
	    } finally {
	        ConxionBDD.cerrarConexion(con);
	    }
	}

	public static void deleteProfesor(int codigo) throws SQLException {
	    Connection con = null;
	    PreparedStatement ps = null;
		LOGGER.trace("Profesor a eliminar>>>>> "+ codigo);

	    try {
	        con = ConxionBDD.conectar();
	        ps = con.prepareStatement("DELETE FROM public.profesores WHERE codigo = ?");
	        ps.setInt(1, codigo);
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        LOGGER.error(e.getMessage(), e);
	        throw e;
	    } finally {
	        ConxionBDD.cerrarConexion(con);
	    }
	}

	public static void deleteEstudiante(String cedula) throws SQLException {
	    Connection con = null;
	    PreparedStatement ps = null;
		LOGGER.trace("Estudiante a eliminar>>>>> "+ cedula);

	    try {
	        con = ConxionBDD.conectar();
	        ps = con.prepareStatement("DELETE FROM public.estudiantes WHERE cedula = ?");
	        ps.setString(1, cedula);
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        LOGGER.error(e.getMessage(), e);
	        throw e;
	    } finally {
	        ConxionBDD.cerrarConexion(con);
	    }
	}


}
