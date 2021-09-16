package com.first_java;

import java.util.Scanner;

public class input_largest {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
        while ( n !=0 ) {
            System.out.println("Enter the next number");
            n = in.nextInt();
            if (n > max) {
                max = n;
            }
        }
        System.out.println("max:" + max );

    }
}
