package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConxionBDD {
	private static final Logger LOGGER = LogManager.getLogger(ConxionBDD.class);

	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER = "postgres";
	private final static String PASSWORD = "12345";

	public static Connection conectar() throws SQLException {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión exitosa");
			LOGGER.debug("Conexión exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error al cargar el controlador JDBC", e);
			throw new SQLException("Error al cargar el controlador JDBC");
		} catch (SQLException e) {
			// Manejar la excepción de SQL
			LOGGER.error("Error al conectarse, revise usuario y clave", e);
			throw new SQLException("Error al conectarse, revise usuario y clave");
		}
		return connection;
	}

	public static void cerrarConexion(Connection connection) throws SQLException {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
            	LOGGER.error("Error con la base de datos",e);
    			throw new SQLException("Error con la base de datos");

            }
        }
	}
}
