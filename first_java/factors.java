package com.first_java;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Factors of " + a + " are: ");
        for (int i=1; i<=a; ++i) {
            if ( a % i ==0){
                System.out.print(i + " ");
            }
        }
    }

}
