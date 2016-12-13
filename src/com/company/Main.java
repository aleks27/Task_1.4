package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your password and press Enter:");
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        
        if(password.equals("123")){
            System.out.println("Your password is correct");
        }
        else
        {
            System.out.println("You are wrong!");
        }
    }
}
