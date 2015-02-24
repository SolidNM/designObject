package com;

public class LoggerFactory {
	//use getLogger method to get object of type logger
	public Logger getLogger(String loggerType){
		if(loggerType == null)
			return null;
		
		if(loggerType.equalsIgnoreCase("debug")){
			return new Debug();
		
		}else if(loggerType.equalsIgnoreCase("info")){
			return new Info();
			
		}else if(loggerType.equalsIgnoreCase("error")){
			return new Error();
		}
		
		return null;
		
	}

}