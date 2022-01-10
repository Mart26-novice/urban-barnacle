package com.laptop.utility;

import java.io.*;

public class Reader {

	private static BufferedReader getReader() {
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
			
		return reader;	
	}
	
	public static String getString(String message) {
		String input = null;
		
		System.out.print(message + ": ");
		
		try {
			input = getReader().readLine();
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		return input;
	}
	
	public static int getInt(String message) {
		int input = 0;
		
		System.out.print(message + ": ");
		
		try {
			input = Integer.parseInt(getReader().readLine());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		} catch (NumberFormatException nfe) {
			System.err.println(nfe.getMessage());
		}
		return input;
	}
	
	public static double getDouble(String message) {
		double input = 0;
		
		System.out.print(message + ": ");
		
		try {
			input = Double.parseDouble(getReader().readLine());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		} catch (NumberFormatException nfe) {
			System.err.println(nfe.getMessage());
		}
		return input;
	}
}

