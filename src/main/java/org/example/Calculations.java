package org.example;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number:");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / (double)num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        scanner.close();
    }

}