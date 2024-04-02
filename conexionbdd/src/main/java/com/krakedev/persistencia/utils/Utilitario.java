package com.krakedev.persistencia.utils;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utilitario {
	private static final Logger LOGGER = LogManager.getLogger(Utilitario.class);

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
	
	public static Date convertirAFechaUtil(String fechaStr) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaDate = null;
        try {
        	LOGGER.trace("Convirtiendo fecha: "+ fechaStr);
        	fechaDate = sdf.parse(fechaStr);
        	LOGGER.trace("Fecha convertida: "+ fechaDate);

        } catch (ParseException e) {
        	LOGGER.error("La fecha no tiene el formato coreccto " +fechaStr ,e);
            throw new Exception("La fecha no tiene el formato coreccto " + fechaStr);
            
        }
        return fechaDate;
    }

	public static Date convertirAHoraUtil(String horaStr) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Date horaDate = null;
        try {
        	LOGGER.trace("Convirtiendo hora: "+ horaStr);
        	horaDate = sdf.parse(horaStr);
        	LOGGER.trace("Hora convertida: "+ horaDate);

        } catch (ParseException e) {
        	LOGGER.error("La hora no tiene el formato coreccto " +horaStr ,e);
            throw new Exception("La hora no tiene el formato coreccto "+horaStr);
            
        }
        return horaDate;
    }
}
