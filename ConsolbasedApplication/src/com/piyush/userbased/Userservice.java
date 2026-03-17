package com.piyush.userbased;

import java.util.ArrayList;
import java.util.List;

public class Userservice {

    private List<User> users = new ArrayList<>();

    // Register
    public String registerUser(String username, String password, String email) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return "Username already taken! Please try another.";
            }
        }
        users.add(new User(username, password, email));
        return "Registration successful!";
    }

    // Login
    public String loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username) &&
                user.getPassword().equals(password)) {
                return "Login successful! Welcome, " + username;
            }
        }
        return "Invalid username or password.";
    }

    // Show all users
    public void showAll() {
        if (users.isEmpty()) {
            System.out.println("No registered users yet.");
        } else {
            System.out.println("\n========== Registered Users ==========");
            for (User user : users) {
                System.out.println("Username: " + user.getUsername() + " | Email: " + user.getEmail());
            }
        }
    }
}
