package com;

import com.Logger.Logger;
import com.Logger.LoggerFactory;

public class MaClasse {

	public static void main(String[] args) {
		
		LoggerFactory loggerFactory = new LoggerFactory();
		
		//Get an object of Debug mode and call its display method
		Logger logger1 = loggerFactory.getLogger("DEBUG");
		
		//Call the display method of Debug
		logger1.debug();
		logger1.info();
		logger1.error();
		
		//Get an object of Info mode and call its display method
		Logger logger2 = loggerFactory.getLogger("INFO");
		
		//Call the display method of Info
		logger2.debug();
		logger2.info();
		logger2.error();
		
		//Get an object of Error mode and call its display method
		Logger logger3 = loggerFactory.getLogger("ERROR");
		
		//Call the display method of Error
		logger3.debug();
		logger3.info();
		logger3.error();
	
	}

}
