package com.dev;

import com.dev.model.BusinessContact;
import com.dev.model.Contact;
import com.dev.model.PersonalContact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

    private static List<Contact> contacts = new ArrayList<>();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            System.out.println("Please choose one of the above options:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    addNewContact();
                    break;
                case 2:
                    printAllContacts();
                    break;
                default:
                    System.out.println("Invalid choice, Please try again...");
            }
        } while (choice != 0);
    }

    private static void printAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("There isn't any contact!!!");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Please choose a contact type:");
        System.out.println("1. Personal Contact");
        System.out.println("2. Business Contact");
        int contactType = scanner.nextInt();
        scanner.nextLine();
        if (contactType == 1){
            System.out.println("Please enter name:");
            String name = scanner.nextLine();
            System.out.println("Please enter family:");
            String family = scanner.nextLine();
            System.out.println("Please enter phone:");
            String phone = scanner.nextLine();
            PersonalContact personalContact = new PersonalContact(name, phone);
            personalContact.setFamily(family);
            contacts.add(personalContact);
            System.out.println("The new contact was added successfully");
        }else if (contactType == 2){
            System.out.println("Please enter name:");
            String name = scanner.nextLine();
            System.out.println("Please enter phone:");
            String phone = scanner.nextLine();
            System.out.println("Please enter fax:");
            String fax = scanner.nextLine();
            BusinessContact businessContact = new BusinessContact(name, phone);
            businessContact.setFax(fax);
            contacts.add(businessContact);
            System.out.println("The new contact was added successfully");
        }else {
            System.out.println("Invalid input type.....");
        }
    }

    private static void printMenu() {
        System.out.println("---- Menu ----");
        System.out.println("0. Exit");
        System.out.println("1. Add new contact");
        System.out.println("2. Print all contacts");
    }
}
