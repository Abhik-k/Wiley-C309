package com.fileio;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		Console console=System.console();
		System.out.println("Enter you name: ");
		String user=console.readLine();
		System.out.println("Enter password:");
		char[] password=console.readPassword();
		System.out.println("Welcom: "+user);
	}
}
