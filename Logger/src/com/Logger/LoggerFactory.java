package com.Logger;

public class LoggerFactory {
	//use getLogger method to get object of type logger
	public Logger getLogger(String loggerType){
		if(loggerType == null)
			return null;
		
		if(loggerType.equalsIgnoreCase("DEBUG")){
			return new Debug();
		
		}else if(loggerType.equalsIgnoreCase("INFO")){
			return new Info();
			
		}else if(loggerType.equalsIgnoreCase("ERROR")){
			return new Error();
		}
		
		return null;
		
	}

}
