
/*
 * This is the main user registration application.
 * It accepts user details and validates them using separate validation classes.
 */

package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UC1FirstNameValidator firstNameValidator =
                new UC1FirstNameValidator();

        UC2LastNameValidator lastNameValidator =
                new UC2LastNameValidator();

        UC3EmailValidator emailValidator =
                new UC3EmailValidator();

        UC4MobileValidator mobileValidator =
                new UC4MobileValidator();

        UC5PasswordValidator passwordValidator =
                new UC5PasswordValidator();

        // Accept user details
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Validate each field
        boolean firstNameValid =
                firstNameValidator.validateFirstName(firstName);

        boolean lastNameValid =
                lastNameValidator.validateLastName(lastName);

        boolean emailValid =
                emailValidator.validateEmail(email);

        boolean mobileValid =
                mobileValidator.validateMobile(mobile);

        boolean passwordValid =
                passwordValidator.validatePassword(password);

        // Display validation results
        System.out.println("\n----- USER REGISTRATION RESULTS -----");

        System.out.println("First Name: " +
                (firstNameValid ? "Valid" : "Invalid"));

        System.out.println("Last Name: " +
                (lastNameValid ? "Valid" : "Invalid"));

        System.out.println("Email: " +
                (emailValid ? "Valid" : "Invalid"));

        System.out.println("Mobile: " +
                (mobileValid ? "Valid" : "Invalid"));

        System.out.println("Password: " +
                (passwordValid ? "Valid" : "Invalid"));

        // Check whether all fields are valid
        if (firstNameValid && lastNameValid && emailValid &&
                mobileValid && passwordValid) {

            System.out.println("\nRegistration Successful!");

        } else {

            System.out.println("\nRegistration Failed!");
        }

        sc.close();
    }
}
