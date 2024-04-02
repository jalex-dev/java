package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Reto30 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345");
			System.out.println("Conexion exitosa");
			System.out.println("Insertar profesor");
			ps= connection.prepareStatement("INSERT INTO public.profesores"
					+ "(codigo, nombre, saldo)"
					+ "VALUES(?, ?, ?)");
			
			ps.setInt(1,4000);
			ps.setString(2, "Joao Alex Rodriguez Castillo");
			ps.setBigDecimal(3,new BigDecimal(1200.56));
			ps.executeUpdate();
			System.out.println("Insertar estuadiantes");
			ps2= connection.prepareStatement("INSERT INTO public.estudiantes"
					+ "(cedula, nombre, apellido, enail, fecha_nacimiento, codigo_profesor)"
					+ "VALUES(?, ?, ?, ?, ?,?);");
			ps2.setString(1, "2400286437");
			ps2.setString(2, "Roberto");
			ps2.setString(3, "Rodriguez");
			ps2.setString(4, "hola@gmail.com");
			ps2.setDate(5, TestConexion.convertirAFechaSQL("2020/03/22 10:34:32"));
			ps2.setInt(6, 4000);
			ps2.executeUpdate();
			System.out.println("ejecuta insert");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
