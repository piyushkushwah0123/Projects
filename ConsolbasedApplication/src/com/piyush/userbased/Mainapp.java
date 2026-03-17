package com.piyush.userbased;

import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Userservice service = new Userservice();

        while (true) {
            System.out.println("\n======= User App Menu ========");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Show All Users");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    String regMsg = service.registerUser(username, password, email);
                    System.out.println(regMsg);
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();

                    String loginMsg = service.loginUser(uname, pass);
                    System.out.println(loginMsg);
                    break;

                case 3:
                    service.showAll();
                    break;

                case 4:
                    System.out.println("Exiting the application... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
