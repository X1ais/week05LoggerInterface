package com.promineotech;

public class SpacedLogger implements Logger{
	@Override
	public void log(String log) {
		String message = String.valueOf(log.charAt(0));
		for (int i = 1; i < log.length(); i++) {
			message += " " + log.charAt(i);
		}
		System.out.println(message);
	}

	@Override
	public void error(String error) {
		String message = String.valueOf(error.charAt(0));
		for (int i = 1; i < error.length(); i++) {
			message += " " + error.charAt(i);
		}
		System.out.println("Error: " + message);
	}
	
}
