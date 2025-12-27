package com.dev;

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
        Contact contact = new Contact();
        System.out.println("Please enter name:");
        contact.setName(scanner.nextLine());
        System.out.println("Please enter phone number:");
        System.out.print("Enter prefix:");
        String prefix = scanner.nextLine();
        System.out.print("Enter phone:");
        String phone = scanner.nextLine();
        contact.setPhone(prefix, phone);
        System.out.println(contact);
        contacts.add(contact);
        System.out.println("The new contact was added successfully.");
    }

    private static void printMenu() {
        System.out.println("---- Menu ----");
        System.out.println("0. Exit");
        System.out.println("1. Add new contact");
        System.out.println("2. Print all contacts");
    }
}
