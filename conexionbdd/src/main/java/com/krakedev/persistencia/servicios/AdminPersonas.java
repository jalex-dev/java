package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas= new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		
		try {
			con=ConxionBDD.conectar();
			ps=con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula= rs.getString("cedula");
				Persona p= new Persona();
				p.setNombre(nombre);
				p.setCedula(cedula);
				personas.add(p);
				
				
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		}finally {
			ConxionBDD.cerrarConexion(con);

		}
		
		return personas;
		
		
	}
	
	public static Persona buscarCedula (String cedula) throws Exception{
		Persona persona= new Persona();
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs;
		
		try {
			con=ConxionBDD.conectar();
			ps=con.prepareStatement("select * from personas where cedula= ?");
			ps.setString(1, cedula);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				String nombre = rs.getString("nombre");
	            String cedulaPersona = rs.getString("cedula");

	            // Crear una instancia de Persona con los datos recuperados de la base de datos
	            persona = new Persona();
	            persona.setNombre(nombre);
	            persona.setCedula(cedulaPersona);
				
				
			}else {
				return null;
			}
			
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por cedula", e);
			throw new Exception("Error al consultar por cedula");
		}finally {
			ConxionBDD.cerrarConexion(con);
		}
		
		
		return persona;
		
		
	}
	
	public static Persona buscarArgumentos(String nombre, String apellido) throws Exception{
		
		Persona persona= new Persona();
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		
		try {
			con= ConxionBDD.conectar();
			ps=con.prepareStatement("select * from personas where nombre = ? and apellido= ?");
			ps.setString(1, nombre);
			ps.setString(2, apellido);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre1=rs.getString("nombre");
				String cedula1= rs.getString("cedula");
				
				persona.setNombre(nombre);
				persona.setCedula(cedula1);

				
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConxionBDD.cerrarConexion(con);

		}
		
		return persona;
		
	}

}
