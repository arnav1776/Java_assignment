package com.first_java;

import java.util.Scanner;

public class si {
    public static void main(String[] args) {

        System.out.println("Enter the principle amount");
        System.out.println("Enter the rate");
        System.out.println("Enter time");

        Scanner input = new Scanner(System.in);
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("simple interest:"+si);

    }
}

