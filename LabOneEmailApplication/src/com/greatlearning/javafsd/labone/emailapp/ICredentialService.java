package com.greatlearning.javafsd.labone.emailapp;

public interface ICredentialService {

	//Methods or Behaviors
	
	String generatePassword();
	
	String generateEmailAddress(Employee employee);
	
	
	void displayCredentials(Employee employee);
	
}
