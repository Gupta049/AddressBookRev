package com.bridgelabz;

import java.util.Scanner;
class ContactPerson{
    String firstName, lastName, Address, city, state, email;
    int zip;
    long phoneNumber;

    public ContactPerson(String firstName, String lastName, String Address, String city, String state, String email, int zip, long phoneNumber){
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
}

public class AddressBook {


    static void addContacts(ContactPerson contactArray[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first name : ");
        String firstNameOfPerson = sc.next();
        System.out.print("enter last name : ");
        String lastNameOfPerson = sc.next();
        System.out.print("Enter Address : ");
        String addressOfPerson = sc.next();
        System.out.print("enter city : ");
        String cityOfPerson = sc.next();
        System.out.print("enter state : ");
        String stateOfPerson = sc.next();
        System.out.print("enter postal code : ");
        int zipCode = sc.nextInt();
        System.out.print("enter phone number value : ");
        long mobileNumber = sc.nextLong();
        System.out.print("enter your email id : ");
        String emailIdOfPerson = sc.next();

        contactArray[0] = new ContactPerson(firstNameOfPerson, lastNameOfPerson, addressOfPerson, cityOfPerson, stateOfPerson, emailIdOfPerson, zipCode, mobileNumber);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        ContactPerson contactArray[] = new ContactPerson[1];
        while (temp != 0) {
            System.out.print("Enter the Choice value  ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addContacts(contactArray);
                    break;
                case 2:
                    temp = 0;
                    break;
                default:
                    System.out.println("invalid choice & ");
            }
            try {
                contactArray[0].display();
            }catch (NullPointerException e){
                System.out.println("If you choose option number 2 then it gives NullPointerException \n" +" to avoid this first you choose option 1 and then \n" + " after giving some information you choose option 2");
            }
        }
    }
}
