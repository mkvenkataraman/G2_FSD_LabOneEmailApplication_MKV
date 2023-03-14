package com.greatlearning.javafsd.labone.emailapp;

//3:01
public class CredentialServiceImpl 
				implements ICredentialService {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub	
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generate();
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		// TODO Auto-generated method stub
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		
		// String builder for concatenating multiple strings
		StringBuilder emailBuilder = new StringBuilder();
		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(".");
		emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".");
		emailBuilder.append("gl.com");
		String emailAddress = emailBuilder.toString();
		employee.setEmailAddress(emailAddress);
		
		return emailAddress;
	}

	@Override
	public void displayCredentials(Employee employee) {
		// TODO Auto-generated method stub
		
		//using system property to get line feed
		String newline = System.getProperty("line.separator"); 
		
		// construct the necessary email body text string
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(",");
		messageBuilder.append(newline);
		messageBuilder.append("Your generated credentials are as follows: ");
		messageBuilder.append(newline);
		messageBuilder.append("Email     ---> ");
		messageBuilder.append(employee.getEmailAddress());
		messageBuilder.append(newline);
		messageBuilder.append("Password  ---> ");
		messageBuilder.append(employee.getPassword());
		
		String finalMessage = messageBuilder.toString();
		System.out.println(finalMessage);
				
	}

}
