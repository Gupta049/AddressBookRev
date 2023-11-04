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
    void displayContactDetails(){
        System.out.println(" Entered Address by user : ");
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

    static void editContact(String name, ContactPerson contactArray[]){
        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        if (contactArray[0].firstName.equals(name)){
            flag = true;
            if (flag == true){
                System.out.println("1. LastName 2.Address 3.City 4.State 5.PostalCode 6.PhoneNumber 7.EmailId 8. Exit");
                int editOption = sc.nextInt();
                switch (editOption){
                    case 1:
                        System.out.println("Edit last name ");
                        String editLastName = sc.next();
                        contactArray[0].lastName = editLastName;
                        break;
                    case 2:
                        System.out.print("Edit address:");
                        String editAddress = sc.next();
                        contactArray[0].Address = editAddress;
                        break;
                    case 3:
                        System.out.print("Edit city:");
                        String editCity = sc.next();
                        contactArray[0].city = editCity;
                        break;
                    case 4:
                        System.out.print("Edit State:");
                        String editState = sc.next();
                        contactArray[0].state = editState;
                        break;
                    case 5:
                        System.out.print("Edit zipCode:");
                        int editZipCode = sc.nextInt();
                        contactArray[0].zip = editZipCode;
                        break;
                    case 6:
                        System.out.print("Edit Mobile:");
                        long editMobileNum = sc.nextLong();
                        contactArray[0].phoneNumber = editMobileNum;
                        break;
                    case 7:
                        System.out.print("Edit EmailId:");
                        String editEmailId = sc.next();
                        contactArray[0].email = editEmailId;
                        break;
                    case 8:
                        System.exit(100);
                        break;
                    default:
                        System.out.println("Invalid Choice!!!");
                        break;
                }
            }else {
                flag = false;
            }
        }
        if (flag == false){
            System.out.println(name + " is not found in Address Book");
        }
    }

    static void displayContacts(ContactPerson contactArray[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("================");
        System.out.println();

        if(contactArray[0] == null)
            System.out.println("Empty Address Book!!! ");
        else
            contactArray[0].displayContactDetails();

        System.out.println();
        System.out.println("================");
    }

    static void deleteContact(String delName, ContactPerson contactArray[]){
        boolean flag = false;
        if (contactArray[0] == null)
            System.out.println();
        else {
            if (contactArray[0].firstName.equals(delName)){
                flag = true;
                contactArray[0]=null;
            }
        }
        if (flag == false)
            System.out.println(delName + " is not found in Address Book");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        ContactPerson contactArray[] = new ContactPerson[1];
        while (temp != 0) {
            System.out.println("1. Add_Contact 2.Edit 3. Display 4. DeleteContact 5. Exit");
            System.out.print("Enter the Choice value  ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addContacts(contactArray);
                    break;
                case 2:
                    System.out.println("Enter name of person you want to edit the details : ");
                    String name = sc.next();
                    editContact(name, contactArray);
                    break;
                case 3:
                    displayContacts(contactArray);
                    break;
                case 4:
                    System.out.print("Enter person name you want to delete the details:");
                    String delName = sc.next();
                    deleteContact(delName, contactArray);
                    break;
                case 5:
                    temp = 0;
                    break;
                default:
                    System.out.println("invalid choice & ");
            }
        }
    }
}
