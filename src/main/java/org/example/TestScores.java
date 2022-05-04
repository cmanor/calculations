package org.example;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 60) {
            System.out.println("your grade is: F");
        } else if (60 < num && num < 70) {
            System.out.println("your grade is: D");
        } else if (70 < num && num < 80) {
            System.out.println("your grade is: C");
        }else if (80 < num && num < 90) {
            System.out.println("your grade is: B");
        }else {
            System.out.println("your grade is: A");
        }
    }
}
