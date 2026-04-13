package com.plaralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        System.out.print("First name:");
        String firstName = scanner.nextLine().trim().toUpperCase();
        firstName =  Character.toUpperCase(firstName.charAt(0)) +
                firstName.substring(1).toLowerCase();

        System.out.print("Middle name:");
        String middleName = scanner.nextLine().trim().toUpperCase();
        middleName =  Character.toUpperCase(middleName.charAt(0)) +
                middleName.substring(1).toLowerCase();

        System.out.print("Last name:");
        String lastName = scanner.nextLine().trim().toUpperCase();
        lastName =  Character.toUpperCase(lastName.charAt(0)) +
                lastName.substring(1).toLowerCase();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();
        suffix =  Character.toUpperCase(suffix.charAt(0)) +
                suffix.substring(1).toLowerCase();

        System.out.printf("Full name: %s,  %s %s. %s", suffix,firstName,middleName,lastName);




    }
}
