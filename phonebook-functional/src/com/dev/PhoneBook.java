package com.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

    private static List<String> names = new ArrayList<>();
    private static List<String> phones = new ArrayList<>();
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
                    System.out.println("Exiting...");
                    break;
                case 1:
                    addNewPhoneBook();
                    break;
                case 2:
                    printAllPhonebooks();
                    break;
                default:
                    System.out.println("Invalid choice, try again....");
            }
        } while (choice != 0);
    }

    private static void printAllPhonebooks() {
        if (names.isEmpty()){
            System.out.println("There isn't any information!!!");
        }else {
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i) + " -- " + phones.get(i));
            }
        }
    }

    private static void addNewPhoneBook() {
        System.out.println("Please enter name:");
        names.add(scanner.nextLine());
        System.out.println("Please enter phone number:");
        phones.add(scanner.nextLine());
        System.out.println("The new phone book was added successfully.");
    }

    private static void printMenu() {
        System.out.println("---- Menu ----");
        System.out.println("0. Exit");
        System.out.println("1. Add new phonebook");
        System.out.println("2. Print all phonebooks");
    }
}
