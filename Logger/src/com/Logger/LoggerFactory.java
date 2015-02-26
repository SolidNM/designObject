package com.Logger;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class LoggerFactory {
	//use getLogger method to get object of type logger
	public Logger getLogger(String loggerType){
		if(loggerType == null)
			return null;
		
		if(loggerType.equalsIgnoreCase("DEBUG")){
			return new BasicLogger(LevelOfLog.DEBUG, System.out);
		
		}else if(loggerType.equalsIgnoreCase("INFO")){
			return new BasicLogger(LevelOfLog.INFO, System.out);
			
		}else if(loggerType.equalsIgnoreCase("ERROR")){
			PrintStream test;
			try {
				test = new PrintStream("/home/nicolas/Bureau/test.txt");
				return new BasicLogger(LevelOfLog.ERROR, test);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return null;
		
	}
	
	

}
