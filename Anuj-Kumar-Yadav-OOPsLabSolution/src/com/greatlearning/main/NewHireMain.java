package com.greatlearning.main;

import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class NewHireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following:");
		
		//hashmap of all the departments
		HashMap<Integer,String> dept = new HashMap<Integer,String>();
		dept.put(1, "Technical");
		dept.put(2, "Admin");
		dept.put(3,"Human resource");
		dept.put(4, "Legal");
		int dptNum=0;
		boolean err = false;
		
		//get the user input for the department 
		//and repeat if the selected value is not available in the HashMap
		
		do{
			System.out.println("(1) Technical \n(2)Admin \n(3)Human resource \n(4)Legal");
			err = false;
			try {
				dptNum = Integer.parseInt(sc.next());
				System.out.println("Dep is "+ dptNum + "- " + dept.get(dptNum));
				if(!dept.containsKey(dptNum)) {
					err = true;
					System.out.println("Invalid input. Please enter 1-4 to select a department, you selected "+ dptNum);
				}
				}
			catch(Exception e){
				err = true;
				System.out.println("Please enter a valid input " + e);
			}
		}while(err == true);
		
		
		
		String fName, lName;
		//get user input for the first name and last name
		System.out.print("Please enter the new hire firstaname ");
		fName = sc.next();
		// System.out.println("first name is " + fName);
		System.out.print("Please enter the new hire LastName");
		lName = sc.next();
		// System.out.println("Last name is "+ lName);
		// create employee object using the user entered values
		Employee e1 = new Employee(fName, lName, dept.get(dptNum));
		
		//create credentials
		CredentialService cs = new CredentialService(e1);
		cs.generateEmailAddress();
		cs.generatePassword();
		cs.showCredentials();
		
		sc.close();
		

	}

}
