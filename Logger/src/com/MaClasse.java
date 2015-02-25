package com;

import com.Logger.Logger;
import com.Logger.LoggerFactory;

public class MaClasse {


	
	public static void main(String[] args) {
		
		
		LoggerFactory loggerFactory = new LoggerFactory();
		
		//Get an object of Debug mode and call its display method
		Logger logger1 = loggerFactory.getLogger("DEBUG");
		
		//Call the display method of Debug
		logger1.debug("Coucou mode *DEBUG");
		logger1.info("Coucou mode *DEBUG");
		logger1.error("Coucou mode *DEBUG");
		
		//Get an object of Info mode and call its display method
		Logger logger2 = loggerFactory.getLogger("INFO");
		
		//Call the display method of Info
		logger2.debug("Coucou mode *INFO");
		logger2.info("Coucou mode *INFO");
		logger2.error("Coucou mode *INFO");
		
		//Get an object of Error mode and call its display method
		Logger logger3 = loggerFactory.getLogger("ERROR");
		
		//Call the display method of Error
		logger3.debug("Coucou mode *ERROR");
		logger3.info("Coucou mode *ERROR");
		logger3.error("Coucou mode *ERROR");
	
	}

}
