package com.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicLogger implements Logger{

	private SimpleDateFormat simpleDateFormat;
	private LevelOfLog levelOfLog;

	public BasicLogger(LevelOfLog lol){
		this.simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		this.levelOfLog = lol;
	}
	
	private void affiche(LevelOfLog lol, String message) {
		
		if(lol.compareTo(this.levelOfLog) >= 0){
			StringBuilder build = new StringBuilder();
			build.append(this.simpleDateFormat.format(new Date()));
			build.append(" [LEVEL=").append(lol.name());
			build.append(" MESSAGE= ").append(message);
			build.append("]");
			System.out.println(build);
		}
		
	}
	
	@Override
	public void debug(String message) {
		this.affiche(LevelOfLog.DEBUG, message);
	
	}


	@Override
	public void info(String message) {
		this.affiche(LevelOfLog.INFO, message);
		
	}

	@Override
	public void error(String message) {
		this.affiche(LevelOfLog.ERROR, message);
		
	}


}
