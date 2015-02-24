package com;

import com.Logger.Logger;
import com.Logger.LoggerFactory;

public class MaClasse {

	public static void main(String[] args) {
		
		LoggerFactory loggerFactory = new LoggerFactory();
		
		//Get an object of Debug mode and call its display method
		Logger logger1 = loggerFactory.getLogger("debug");
		
		//Call the display method of Debug
		logger1.display();
		
		//Get an object of Info mode and call its display method
		Logger logger2 = loggerFactory.getLogger("info");
		
		//Call the display method of Info
		logger2.display();
		
		//Get an object of Error mode and call its display method
		Logger logger3 = loggerFactory.getLogger("error");
		
		//Call the display method of Error
		logger3.display();
	
	}

}
