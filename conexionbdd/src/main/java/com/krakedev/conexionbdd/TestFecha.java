package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	public static void main(String[] args) {
		
		//Date - java.util.Date
		// Date - java.sql.Date
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");	
		String fechaStr = "2020/03/22 10:34:32";
		try {
			Date fecha=sf.parse(fechaStr);
			System.out.println(fecha);
			long fechaMilis = fecha.getTime();
			System.out.println(fechaMilis);
			java.sql.Date fecahSql = new java.sql.Date(fechaMilis);
			System.out.println(fecahSql);
			Time timeSql = new Time(fechaMilis);
			System.out.println(timeSql);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
