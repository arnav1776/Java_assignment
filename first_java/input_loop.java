package com.first_java;

import java.util.Scanner;

public class input_loop {
    public static void main(String[] args) {
        int sum = 0, n = 1;
        while ( n !=0 ) {
            System.out.println("Enter a number");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            sum = sum + n;
        }
        System.out.println("sum is:" + sum );

    }
}
