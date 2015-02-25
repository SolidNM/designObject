package com.Logger;


public class BasicLogger implements Logger{

	private void affiche(String levelOfLog, String message) {
		System.out.println(message);
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
