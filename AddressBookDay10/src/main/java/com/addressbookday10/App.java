package com.addressbookday10;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome To Address Book..!" );
        
        List<ContactsUc1> contact = new ArrayList<ContactsUc1>();
        ContactsUc1 newContact = new ContactsUc1("Deven","Mali", "Dhule", "Dhule", "Maharastra", "42405", "94058865", "deven7818");
        contact.add(newContact);
        System.out.println(contact);
    }
}
