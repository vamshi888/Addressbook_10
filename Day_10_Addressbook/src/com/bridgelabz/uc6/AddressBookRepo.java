package com.bridgelabz.uc6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookRepo {
    	static Map<String, AddressBook> addressBookMap = new HashMap<>();
    	static Scanner sc = new Scanner(System.in);
    public static void addNewAddressBook() {
        		System.out.println("Enter the Address Book Name :");
    		String addressbookName = sc.next();
    	if(addressBookMap.containsKey(addressbookName)) {
        		System.out.println("Entered AddressBook is Already Available");
        } 
    	else {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(addressbookName,addressBook);
        	}
    	}
    public static void displayAddressBooks() {
        for(String key: addressBookMap.keySet()){
            	System.out.println(key);
        	}
    	}
    public static void selectAddressBook() {
        displayAddressBooks();
        		System.out.println("Enter the Address Book Name :");
    		String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            addressBookMap.get(addressbookName).contactOptions(addressBookMap.get(addressbookName));
        } 
        else {
            System.out.println("Entered Address Book Name is Invalid");
        	}
    	}
    public static void editAddressBook() {
        displayAddressBooks();
        		System.out.println("Enter the Address Book Name :");
        		String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
//            System.out.println("Enter the New Name for Addressbook :");
//            String newName = sc.next();
//            addressBookMap.;
        } 
        else {
            System.out.println("Entered Address Book Name is Invalid");
        	}
    	}
    public static void deleteAddressBook() {
        displayAddressBooks();
        		System.out.println("Enter the Address Book Name :");
    		String addressbookName = sc.next();
        if(addressBookMap.containsKey(addressbookName)) {
            addressBookMap.remove(addressbookName);
            	System.out.println("Address Book is Deleted");
        } 
        else {
            System.out.println("Entered Address Book Name is Invalid");
        	}
    	}
    public static final int userInput() {
        return sc.nextInt();
    	}
}