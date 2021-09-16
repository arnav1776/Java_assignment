package com.first_java;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n%2==0) {
            System.out.println("even");
    }
        else {
            System.out.println("odd");
        }
}
}
