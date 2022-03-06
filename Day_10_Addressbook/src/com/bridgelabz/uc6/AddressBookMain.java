package com.bridgelabz.uc6;


import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Problem");							
        int choice; 																				
        //Variable for user Choice
        do {																						
        	//Show Menu for user to Select Operation on AddressBook
            System.out.println("---- ADDRESS BOOK MANAGEMENT ----");
            System.out.println("1. ADD NEW ADDRESSBOOK\n2. EDIT ADDRESSBOOK\n3. DELETE ADDRESSBOOK" + "\n4. DISPLAY ADDRESSBOOKS\n5. SELECT ADDRESSBOOK\n6. EXIT");
            System.out.println("Please Select the Operation Number : ");
            	choice = AddressBookRepo.userInput();
        switch (choice) {
            case 1:
                AddressBookRepo.addNewAddressBook();    										
                //Adding New Address Book to System
                break;
            case 2:
                //Edit Address Book Details
                //addressBook.editContact();
                break;
            case 3:
                AddressBookRepo.deleteAddressBook();   										
                //Delete the Address Book Details
                break;
            case 4:
                AddressBookRepo.displayAddressBooks();  									
                //Show Contact Details
                break;
            case 5:
                AddressBookRepo.selectAddressBook();
                break;
            case 6:
                System.out.println("Thank You for using Address Book System.");
                break;
            default:
                System.out.println("Please Select the Operation between 1 to 6 only.");
                    break;
            	}
        	}
        while( choice != 6 );
    	}
}