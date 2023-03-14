package com.greatlearning.javafsd.labone.emailapp.test;

import com.greatlearning.javafsd.labone.emailapp.PasswordGenerator;

public class PasswordGeneratorTest {
	
	public static void main(String[] args) {
		
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generate();
		System.out.println("Generated Password -> "+password);
	
	}
}