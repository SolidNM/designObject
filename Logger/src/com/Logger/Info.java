package com.Logger;

public class Info implements Logger{

	@Override
	public void debug(String message) {
		return ;		
	}

	@Override
	public void info(String message) {
		StringBuilder builder = new StringBuilder();
		builder.append("LEVEL=INFO MESSAGE=");
		builder.append(message);
		builder.append("]");
		System.out.println(builder.toString());
		
	}

	@Override
	public void error(String message) {
		StringBuilder builder = new StringBuilder();
		builder.append("LEVEL=ERROR MESSAGE=");
		builder.append(message);
		builder.append("]");
		System.out.println(builder.toString());
		
	}

}
