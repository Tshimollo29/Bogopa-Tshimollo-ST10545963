package com.mycompany.icetask3;

import java.util.Scanner;

public class IceTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String savedUser = "";
        String savedPass = "";

        while (true) {
            System.out.println("\n1. Register  \n2. Login  \n3. Exit");
            System.out.print("Choose: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter username: ");
                savedUser = input.nextLine();
                System.out.print("Enter password: ");
                savedPass = input.nextLine();
                System.out.println("Registered!");

            } else if (choice.equals("2")) {
                System.out.print("Enter username: ");
                String user = input.nextLine();
                System.out.print("Enter password: ");
                String pass = input.nextLine();

                if (user.equals(savedUser) && pass.equals(savedPass)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed!");
                }

            } else if (choice.equals("3")) {
                break;
            }
        }
    }
}
