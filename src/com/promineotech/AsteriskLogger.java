package com.promineotech;

public class AsteriskLogger implements Logger {
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		String stars = "************";
		for (int i = 0; i < error.length(); i++) {
			stars += "*";
		}
		System.out.println(stars);
		System.out.println("***ERROR:" + error + "***");
		System.out.println(stars);

	}
	
}
