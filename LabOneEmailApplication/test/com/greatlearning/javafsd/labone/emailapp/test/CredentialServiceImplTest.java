package com.greatlearning.javafsd.labone.emailapp.test;

import com.greatlearning.javafsd.labone.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.labone.emailapp.Employee;

public class CredentialServiceImplTest {
	
	public static void main(String[] args) {
	
		testEmailAddressGeneration();
		testPasswordGeneration();
		testDisplayCredentials();

	}
	
	static void testEmailAddressGeneration() {
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		Employee sunil = new Employee("Sunil","Kumar","Tech");
		String emailAddress = serviceImpl.generateEmailAddress(sunil);
		System.out.println(emailAddress);
	}
	
	static void testPasswordGeneration() {
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		String password = serviceImpl.generatePassword();
		System.out.println(password);
		
	}
	
	static void testDisplayCredentials() {
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		Employee sunil = new Employee("Sunil","Kumar","Tech");
		serviceImpl.generateEmailAddress(sunil); 				// set the email address
		String password = serviceImpl.generatePassword();		// generate the password
		sunil.setPassword(password);							// set the password
		serviceImpl.displayCredentials(sunil);		// display the credentials
	}
}
