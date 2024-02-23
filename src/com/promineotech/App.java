package com.promineotech;

public class App {

	public static void main(String[] args) {
		String greeting = "Hello";

		// Instantiating an instant of each type of Class that implements Logger
		Logger message1 = new AsteriskLogger();
		Logger message2 = new SpacedLogger();
		
		// Testing the first Class- AsteriskLogger
		message1.log(greeting);
		message1.error("Welcome to the Jungle");
		
		// Testing the second Class- SpacedLogger
		message2.log(greeting);
		message2.error("We've got fun and games");
	}

}
