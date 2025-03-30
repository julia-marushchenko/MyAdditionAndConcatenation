package com.additionconcantenation;

// Class Main
public class Main {

    // Method main to run java application
    public static void main(String[] args) {

        // Print statements to demonstrate
        // addition and concatenation
        // using + operator
        System.out.println(2 + 0 + 2 + 5 + "String"); // Output: 9String
        System.out.println("String" + 2 + 0 + 2 + 5 ); // Output: String2025
        System.out.println(2 + 0 + 2 + 5 + "String" + 2 + 0 + 2 + 5); // Output: 9String2025
        System.out.println(2 + 0 + 2 + 5 + "String" + (2 + 0 + 2 + 5)); // Output: 9String9

    }
}