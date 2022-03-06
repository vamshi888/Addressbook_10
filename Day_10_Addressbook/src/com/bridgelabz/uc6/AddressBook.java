package com.bridgelabz.uc6;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    		Scanner sc = new Scanner(System.in);		
    		//Scanner object for User Input
    	int choice;
    		ArrayList<Contacts> contactList = new ArrayList<>();
    public void addNewContact() {											
    	,//Method to Add New Contact to AddressBook
        Contacts contacts = new Contacts();
        	System.out.println("Enter the Contact Details -");
        	System.out.println("Enter the First Name :");
        contacts.setFirstName(sc.next());
        	System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        	System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        	System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        	System.out.println("Enter the State :");
        contacts.setState(sc.next());
        	System.out.println("Enter the Zip Code :");
        contacts.setZip(sc.next());
        	System.out.println("Enter the Phone Number :");
        contacts.setPhoneNo(sc.next());
        	System.out.println("Enter the EMail ID :");
        contacts.setEmailID(sc.next());
        	contactList.add(contacts);
    }
    public void displayContact() {															    //Method to Show the Contact Details
        for(Contacts contact : contactList) {
            if (contact.getFirstName() == null) {
                System.out.println("Contact Details Not Available");
            	} 
            else {
                System.out.println("Contact Details -");
                System.out.println("First Name : " + contact.getFirstName());
                System.out.println("Last Name : " + contact.getLastname());
                System.out.println("Address : " + contact.getAddress());
                System.out.println("City : " + contact.getCity());
                System.out.println("State : " + contact.getState());
                System.out.println("Zip Code : " + contact.getZip());
                System.out.println("Phone Number : " + contact.getPhoneNo());
                System.out.println("EMail ID : " + contact.getEmailID());
            }
        }
    }
    public void editContact() {																
    	//Method to Edit the Existing Contact
        	System.out.println("Enter the First Name : ");										
        	//Get First Name to Edit the Contact
        String firstName = sc.next();
        boolean isAvailable = false;															
        //check if the Given User with First Name
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                    System.out.println("Enter the Last Name :");
                    	contact.setLastname(sc.next());
                    System.out.println("Enter the Address :");
                    	contact.setAddress(sc.next());
                    System.out.println("Enter the City :");
                    	contact.setCity(sc.next());
                    System.out.println("Enter the State :");
                    	contact.setState(sc.next());
                    System.out.println("Enter the Zip Code :");
                    	contact.setZip(sc.next());
                    System.out.println("Enter the Phone Number :");
                    	contact.setPhoneNo(sc.next());
                    System.out.println("Enter the EMail ID :");
                    	contact.setEmailID(sc.next());
                    break;
            	}
        	}
        if(!isAvailable) {
            	System.out.println("Contact Number Not Found.");
        	}
    	}
    public void deleteContact() {													
    	//Method to Delete the Existing Contact
        	System.out.println("Enter the First Name : ");								 
        	//Get First Name to Edit the Contact
        String firstName = sc.next();     
        boolean isAvailable = false;												
        //check if the Given User with First Name
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                isAvailable = true;
                	contactList.remove(contact);
                System.out.println("Contact Deleted.");
                break;
            	}
        	}
        if(!isAvailable) {
            System.out.println("Contact Number Not Found.");
        	}
    	}
    public void contactOptions(AddressBook addressBook) {
        do {																		
        	//Show Menu for user to Select Operation on AddressBook
            System.out.println("---- ADDRESS BOOK MANAGEMENT ----");
            System.out.println("1. ADD NEW CONTACT\n2. EDIT CONTACT\n3. DELETE CONTACT" + "\n4. DISPLAY CONTACT\n5. EXIT");
            System.out.println("Please Select the Operation Number : ");
            	choice = addressBook.sc.nextInt();
        switch (choice) {
            case 1:
                addressBook.addNewContact();   
                //Adding New Contact Details
                break;
            case 2:
                addressBook.editContact();  
                //Edit Contact Details
                break;
            case 3:
                addressBook.deleteContact();   
                //Delete the Contact Details
                break;
            case 4:
                addressBook.displayContact();   
                //Show Contact Details
                break;
            case 5:
                System.out.println("Thank You for Using Address Book.");
                break;
            default:
                System.out.println("Please Select the Operation between 1 to 5 only.");
                break;
        	}
        }
        while( choice != 5 );
    }
}