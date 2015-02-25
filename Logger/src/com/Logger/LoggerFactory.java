package com.Logger;

public class LoggerFactory {
	//use getLogger method to get object of type logger
	public Logger getLogger(String loggerType){
		if(loggerType == null)
			return null;
		
		if(loggerType.equalsIgnoreCase("DEBUG")){
			return new BasicLogger();
		
		}else if(loggerType.equalsIgnoreCase("INFO")){
			return new BasicLogger();
			
		}else if(loggerType.equalsIgnoreCase("ERROR")){
			return new BasicLogger();
		}
		
		return null;
		
	}
	
	

}
