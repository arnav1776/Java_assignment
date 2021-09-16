package com.functions;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = in.nextInt();

        if(vote(age)){
            System.out.println("You are elligible to vote");
        }
        else{
            System.out.println("You are not elligible to vote");
        }

        in.close();
    }

    public static boolean vote(int age){
        return age >= 18;
    }
}


