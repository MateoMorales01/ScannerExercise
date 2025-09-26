package com.pluralsight;


import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Hello " + firstName);

        System.out.print("How old are you?: ");
        Integer Age = scanner.nextInt();
        System.out.println("You are years old " + Age);

        System.out.print("What is your height in meters?: ");
        Double Height = scanner.nextDouble();
        System.out.println("Your Height is " + Height);

        System.out.print("Do you like using Java? Enter True or False: ");
        boolean userLikesJava = scanner.nextBoolean();

        System.out.printf("Name: %s \nAge: %d \nHeight: %.2f meters tall. \nDoes user like Java?: %b", firstName, Age, Height, userLikesJava);
    }
}
