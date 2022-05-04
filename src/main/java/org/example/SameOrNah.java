package org.example;

import java.util.Objects;
import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str1 = scanner.nextLine();
        System.out.println("Enter another word: ");
        String str2 = scanner.nextLine();
        if (Objects.equals(str1, str2))
        {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
<<<<<<< HEAD
        scanner.close();
=======
>>>>>>> origin/master
    }
}
