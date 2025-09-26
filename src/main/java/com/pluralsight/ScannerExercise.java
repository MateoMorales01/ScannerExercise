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

        System.out.print("");

    }
}
