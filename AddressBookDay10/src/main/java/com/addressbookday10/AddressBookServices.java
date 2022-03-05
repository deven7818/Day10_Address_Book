package com.addressbookday10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookServices {

	Scanner sc = new Scanner(System.in);

	List<PersonInfo> contacts = new ArrayList<PersonInfo>();

	/**
	 * Take input from user to add contact
	 */
	public void addContact() { 

		Scanner sc = new Scanner(System.in);
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
		int zip = sc.nextInt();

		System.out.print(" Please enter the phone number: ");
		Long phoneNumber = sc.nextLong();

		System.out.print(" Please enter the email: ");
		String email = sc.next();

		PersonInfo newContact = new PersonInfo(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contacts.add(newContact);

		sc.close();

	}

	/**
	 * find contact
	 * @return - contact
	 */
	public PersonInfo findContact() { 
		System.out.println("\n Enter the first name of the contact to edit: ");
		String name = sc.next();
		int duplicate = 0; // will increment the duplicate if found multiple contacts with same name
		PersonInfo temp = null;
		for (PersonInfo contact : contacts) {
			if (contact.getFirstName().equals(name)) {
				duplicate++;
				temp = contact;
			}
		}
		if (duplicate == 1) {
			return temp;

		} else if (duplicate > 1) {
			System.out.print(" There are multiple contacts with given name.\n Please enter their email id: ");
			String email = sc.next();
			for (PersonInfo contact : contacts) {
				if (contact.getFirstName().equals(name) && contact.getEmail().equals(email)) {
					return contact;
				}
			}
		} else {
			System.out.println("No contact with the given first name. Please enter the correct first name");
			findContact();
		}
		return temp;
	}

	/*
	 *edit contact information  
	 */
	public void editContact() {

		PersonInfo contact = findContact();

		System.out.println("Enter your choice to edit: " + "\n 1.Edit first name" + "\n 2.Edit last name"
				+ "\n 3.Edit address" + "\n 4.Edit city" + "\n 5.Edit state" + "\n 6.Edit zipcode"
				+ "\n 7.Edit phone number" + "\n 8.Edit email");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter new first name");
			String newFirstName = sc.next();
			contact.setFirstName(newFirstName);
			System.out.println("new first name updated");

			break;
		case 2:
			System.out.println("Enter new last name");
			String newLastName = sc.next();
			contact.setLastName(newLastName);
			System.out.println("new last name updated");

			break;
		case 3:
			System.out.println("Enter new address");
			String newAddress = sc.next();
			contact.setAddress(newAddress);
			System.out.println("new newaddress updated");

			break;
		case 4:
			System.out.println("Enter new city");
			String newCity = sc.next();
			contact.setCity(newCity);
			System.out.println("new city updated");

			break;
		case 5:
			System.out.println("Enter new state");
			String newState = sc.next();
			contact.setState(newState);
			System.out.println("new state updated");

			break;
		case 6:
			System.out.println("Enter new zip code");
			int newZipCode = sc.nextInt();
			contact.setZip(newZipCode);
			System.out.println("new zip code updated");
			break;

		case 7:
			System.out.println("Enter new phone number");
			long newPhoneNumber = sc.nextLong();
			contact.setPhoneNumber(newPhoneNumber);
			System.out.println("new phone number updated");

			break;

		case 8:
			System.out.println("Enter new email");
			String newEmail = sc.next();
			contact.setEmail(newEmail);
			System.out.println("new email updated");

			break;

		default:
			System.out.println("Please enter a number between 1 to 8 only...");
			break;
		}
		System.out.println("The contact after editing is : " + contact);

	}

	public void displayContact() {
		System.out.println(contacts);
	}
	/**
	 * delete contact by name
	 */
	public void deleteContact() {                                                                       //to delete contact
		PersonInfo contact = findContact();
		if (contact == null) {
			System.out.println("No contact found with the given name");
			return;
		}
		contacts.remove(contact);                                                                        // remove method to delete the contact
		System.out.println("The contact has been deleted from the Address Book");
	}

}
