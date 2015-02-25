package com.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Debug implements Logger {

	String format = "yyyy-MM-dd HH:mm:ss.SSS";
	String date = new String();
	SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.FRANCE);


	@Override
	public void debug(String message) {
		StringBuilder builder = new StringBuilder();
		date=sdf.format(new Date());
		builder.append(date.toString());
		builder.append(" [NAME=COM.LOGGER LEVEL=DEBUG MESSAGE= ");
		builder.append(message);
		builder.append("]");
		System.out.println(builder.toString());
	}

	@Override
	public void info(String message) {
		StringBuilder builder = new StringBuilder();
		date=sdf.format(new Date());
		builder.append(date.toString());
		builder.append(" [NAME=COM.LOGGER LEVEL=INFO MESSAGE= ");
		builder.append(message);
		builder.append("]");
		System.out.println(builder.toString());
	}

	@Override
	public void error(String message) {
		StringBuilder builder = new StringBuilder();
		date=sdf.format(new Date());
		builder.append(date.toString());
		builder.append(" [NAME=COM.LOGGER LEVEL=ERROR MESSAGE= ");
		builder.append(message);
		builder.append("]");
		System.out.println(builder.toString());
	}

	
	

}
