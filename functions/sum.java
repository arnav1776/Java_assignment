package com.functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = in.nextInt();

        System.out.println("Enter second number");
        int b = in.nextInt();

        sum(a,b);

        in.close();
    }

    public static void sum (int n_a, int n_b){
       int sum = 0;
       sum = n_a + n_b;
        System.out.println("Sum of two numbers: "+sum);
    }
}
