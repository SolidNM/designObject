package com.Logger;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class LoggerFactory {
	//use getLogger method to get object of type logger
	public Logger getLogger(String loggerType) throws FileNotFoundException{
		if(loggerType == null)
			return null;
		
		if(loggerType.equalsIgnoreCase("DEBUG")){
			PrintStream out;
			//Remplacer System.out par votre cible pour le logger DEBUG.
			out = new PrintStream(System.out);
			return new BasicLogger(LevelOfLog.DEBUG, out);
		
		}else if(loggerType.equalsIgnoreCase("INFO")){
			PrintStream out;
			//Remplacer System.out par votre cible pour le logger INFO.
			out = new PrintStream(System.out);
			return new BasicLogger(LevelOfLog.INFO, out);
			
		}else if(loggerType.equalsIgnoreCase("ERROR")){
			PrintStream out;
			//Remplacer System.out par votre cible pour le logger ERROR.
				out = new PrintStream(System.out);
				return new BasicLogger(LevelOfLog.ERROR, out);
			
			
		}
		
		return null;
		
	}
	
	

}
