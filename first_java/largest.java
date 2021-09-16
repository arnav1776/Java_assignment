package com.first_java;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = input.nextFloat();
        System.out.println("Enter the second number");
        float b = input.nextFloat();

        if (a>b) {
            System.out.println("first number is greater");
        }
        if (b>a) {
            System.out.println("second number is greater");
        }
        else {
            System.out.println("both number are equal");
        }
    }
}
