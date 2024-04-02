package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345");
			System.out.println("Conexion exitosa");
			
			ps= connection.prepareStatement("INSERT INTO public.personas("
					+ "	cedula, nombre, apellido, estatura, estado_civil_codigo,numero_hijos,cantidad_ahorrada,fecha_nacimiento, hora_nacimiento)"
					+ "	VALUES (?, ?, ?, ?, ?,?,?,?,?);");
			
			ps.setString(1,"2400286437");
			ps.setString(2, "Joao Alex");
			ps.setString(3,"Rodriguez Castillo");
			ps.setDouble(4, 1.60);
			ps.setString(5, "S");
			ps.setInt(6, 3);
			ps.setBigDecimal(7,new BigDecimal(1200.56));
			ps.setDate(8, convertirAFechaSQL("2020/03/22 10:34:32"));
			ps.setTime(9, convertirAHoraSQL("2020/03/22 10:34:32"));
			ps.executeUpdate();
			
			System.out.println("ejecuta insert");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static java.sql.Date convertirAFechaSQL(String fechaStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		try {
			java.util.Date fechaUtil = sdf.parse(fechaStr);
			long tiempoMillis = fechaUtil.getTime();
			return new java.sql.Date(tiempoMillis);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Time convertirAHoraSQL(String fechaStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		try {
			java.util.Date fechaUtil = sdf.parse(fechaStr);
			long tiempoMillis = fechaUtil.getTime();
			return new Time(tiempoMillis);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

}
