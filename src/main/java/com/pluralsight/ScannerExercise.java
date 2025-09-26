package com.pluralsight;


import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Hi " + firstName);

    }
}
