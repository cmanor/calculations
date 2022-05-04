package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter another number:");
        int num2 = Integer.parseInt(scanner.nextLine());
        if (num1 == num2) {
            System.out.println("The numbers are the same");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
        scanner.close();
    }
}
