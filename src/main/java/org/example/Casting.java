package org.example;

public class Casting {
    public static void main(String[] args) {
        double var1 =112.35;
        int var2 = (int)var1;
        System.out.println("Double: " + var1);
        System.out.println("int: " + var2 );
        String str1 = "49";
        int str2 = Integer.parseInt(str1);
        System.out.println("The string value is: " + str1);
        System.out.println("The integer value is: " + str2);
    }
}