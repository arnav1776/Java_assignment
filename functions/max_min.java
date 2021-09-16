package com.functions;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Program to find largest and smallest of three numbers");

        System.out.println("Enter the first number");
        int first = in.nextInt();
        System.out.println("Enter the second number");
        int second = in.nextInt();
        System.out.println("Enter the first number");
        int third = in.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("largest no: %d", largest);
        System.out.printf("smallest no: %d", smallest);

        in.close();
    }


    public static int largest(int first, int second, int third) {
    int max = first;
    if (second > max) {
        max = second;
    }

    if (third > max) {
        max = third;
    }

    return max;
    }

    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }
}
