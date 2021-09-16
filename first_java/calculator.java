package com.first_java;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = input.nextFloat();
        System.out.println("Enter the second number");
        float b = input.nextFloat();
        System.out.println("Enter the operator");
        char c = input.next().charAt(0);

        if ( c == '+')
        {
            System.out.println("result:"+(a+b));
        }
        if ( c == '-')
        {
            System.out.println("result:"+(a-b));
        }
        if ( c == '*')
        {
            System.out.println("result:"+(a*b));
        }
        if ( c == '/')
        {
            System.out.println("result:"+(a/b));
        }
        else {
            System.out.println("invalid character");
        }

    }
}