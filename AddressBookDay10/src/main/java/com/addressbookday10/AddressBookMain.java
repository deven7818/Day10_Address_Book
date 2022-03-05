package com.addressbookday10;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("---------Address Book---------");
		Scanner sc = new Scanner(System.in);

		// List<PersonInfo> contacts = new ArrayList<PersonInfo>();
		AddressBookServices addnew = new AddressBookServices();

		addnew.addContact();

		while (true) {
			System.out.println(
					"Enter your choice:\n 1. Add Contact\n 2. Edit Contact \n 3. Display Contacts  \n 4. Exit ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the contact info to add in the Address Book: ");
				addnew.addContact();

				break;
			case 2:
				System.out.println("Enter the contact to edit: ");
				addnew.editContact();

				break;

			case 3:
				System.out.println("The contacts in the Address Book are ");
				addnew.displayContact();
				break;

			case 4:
				System.out.println("Enter contact to delete: ");
				addnew.deleteContact();
				break;
			case 5:
				System.out.println("Exited : ");
				sc.close();
				return;

			}
		}

	}
}
