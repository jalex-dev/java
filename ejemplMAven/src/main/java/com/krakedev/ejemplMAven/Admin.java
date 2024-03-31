package com.krakedev.ejemplMAven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger = LogManager.getLogger(Admin.class);
	
	
	public void agregar() {
		logger.info("mensaje de info");
		logger.warn("mensaje de warn");
		logger.trace("mensaje de trace");
		logger.error("mensaje de error");
		logger.debug("mensaje de debug");

	}
}
