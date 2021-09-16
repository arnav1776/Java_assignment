package com.first_java;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        System.out.println("Enter you name");
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        System.out.println("Hello " +n);
    }
}

