package com.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicLogger implements Logger{

	private SimpleDateFormat simpleDateFormat;

	public BasicLogger(){
		this.simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	}
	
	private void affiche(String levelOfLog, String message) {
		System.out.println(this.simpleDateFormat.format(new Date()) + " " + message);
		}
	
	@Override
	public void debug(String message) {
		this.affiche("DEBUG",message);
	
	}


	@Override
	public void info(String message) {
		this.affiche("INFO", message);
		
	}

	@Override
	public void error(String message) {
		this.affiche("ERROR", message);
		
	}


}
