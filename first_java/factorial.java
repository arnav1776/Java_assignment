package com.first_java;

import java.util.Scanner;

class factorial{
    public static void main(String[] args) {
        int i,fact=1;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial:"+fact);
    }
}