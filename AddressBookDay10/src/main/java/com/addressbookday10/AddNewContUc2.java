package com.addressbookday10;

import java.util.List;
import java.util.Scanner;

public class AddNewContUc2 {
	
	Scanner sc = new Scanner(System.in);

	public void addContact(List<ContactsUc1> contacts) {
		
		
		System.out.print(" Please enter the first name: ");
		String firstName = sc.next();

		System.out.print(" Please enter the last name: ");
		String lastName = sc.next();

		System.out.print(" Please enter the address: ");
		String address = sc.next();

		System.out.print(" Please enter the city: ");
		String city = sc.next();

		System.out.print(" Please enter the state: ");
		String state = sc.next();

		System.out.print(" Please enter the zip: ");
		String zip = sc.next();

		System.out.print(" Please enter the phone number: ");
		String phoneNumber = sc.next();

		System.out.print(" Please enter the email: ");
		String email = sc.next();
 
		//taking the input from console to adding  the Contact in ArrayList contacts
		
		ContactsUc1 newContact = new ContactsUc1(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contacts.add(newContact);
	}

}
