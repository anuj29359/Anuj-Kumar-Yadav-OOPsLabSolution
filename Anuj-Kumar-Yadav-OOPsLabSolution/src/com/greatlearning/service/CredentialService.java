package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.main.NewHireMain;
import com.greatlearning.model.Employee;

public class CredentialService {
	
	Employee myHire;
	
	public CredentialService(Employee newHire) {
		this.myHire= newHire;
		
	}
	
	public String generatePassword() {
		String strCapLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strSmlLetters="abcdefghijklmnopqrstuvwxyz";
		String stNumbers = "0123456789";
		String strSplChar = "!@#$%^&*()+_-";
		String strValues = strCapLetters
							+ strSmlLetters
							+ stNumbers
							+ strSplChar;
		
		Random rd = new Random();
		char[] password = new char[8];
		
		// generate an array for randomly selected 8 char
		for (int i = 0; i < password.length; i++) {
			password[i] = strValues.charAt(rd.nextInt(strValues.length()));
		}
		
		myHire.setPassword(new String(password));
		return myHire.getPassword();
	}
	
	public void generateEmailAddress() {
		String email =  myHire.getfName().toLowerCase().replace(" ", "")
				+myHire.getlName().toLowerCase().replace(" ", "")
				+"@"
				+myHire.getDept().toLowerCase().replace(" ", "")
				+"."
				+myHire.getCompany().toLowerCase().replace(" ", "")
				+".com";
		myHire.setEmail(email);
		
	}
	
	public void showCredentials() {
		System.out.println("\nWelcome "+ myHire.getfName() + " "+ myHire.getlName() + "\nHere are your details-\n");
		System.out.println("Email: " + myHire.getEmail());
		System.out.println("Password: " + myHire.getPassword());
	}

}
