package com.functions;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = in.nextInt();

        evenodd(n);

        in.close();
    }

    public static void evenodd(int n){
        if(n%2==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

