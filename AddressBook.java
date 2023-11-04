package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    String firstName, lastName, Address, city, state, email;
    int zip;
    long phoneNumber;

    public AddressBook(String firstName, String lastName, String Address, String city, String state, String email, int zip, long phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = Address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    void display(){
        System.out.println("Entered Address by user : ");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Address : " + Address);
        System.out.println("City : "+ city);
        System.out.println("State : " + state);
        System.out.println("Postal Code(Zip Code) : " + zip );
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First name ");
        String firstName = sc.next();
        System.out.print("Enter your Last name ");
        String lastName = sc.next();
        System.out.print("please enter address ");
        String address = sc.next();
        System.out.print("Enter your city ");
        String cityName = sc.next();
        System.out.print("Enter your state ");
        String state = sc.next();
        System.out.print("Enter your Postal Code ");
        int postalCode = sc.nextInt();
        System.out.print("Enter your phone number ");
        long number = sc.nextLong();
        System.out.print("Enter your email id ");
        String emailId = sc.next();


        AddressBook contactsInBook = new AddressBook(firstName, lastName, address, cityName, state, emailId, postalCode, number);
        contactsInBook.display();
    }
}
