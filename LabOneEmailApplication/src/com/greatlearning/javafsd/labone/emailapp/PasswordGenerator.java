package com.greatlearning.javafsd.labone.emailapp;

import java.util.Random;

public class PasswordGenerator {
	
	public String generate() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "~!@#$%^&*()_+;{}[]";
		
		String combinedString = capitalLetters + smallLetters + numbers + specialCharacters;
		Random randomObj = new Random();

		//Concatenate the characters to a password string
		StringBuilder passwordBuilder = new StringBuilder();
		
		// eight character password
		for (int index=1; index <= 8l; index ++) {
			
			//Generate single random character
			int length = combinedString.length();
			System.out.println("Length -> "+length);

			int randomIndex = randomObj.nextInt(length);
			System.out.println("Random Index -> "+randomIndex);
		
			char charValue = combinedString.charAt(randomIndex);
			System.out.println("Character -> "+charValue);
			
			passwordBuilder.append(charValue);
			
		}
		String password = passwordBuilder.toString(); //to return the string password
		return password;
	}
}
