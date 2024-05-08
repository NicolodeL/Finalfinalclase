package org.example;

import Interacciones.Tweet;
import Usuario.UserAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
    private static List<UserAccount> users = new ArrayList<>();
    private static UserAccount currentUser;

    public static void main(String[] args) {
        createUsersFile();
        loadUsersFromFile();
        // Implementar el menú aquí
    }

    private static void loadUsersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 2 || !parts[1].contains("@")) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }
                UserAccount user = UserAccount.fromString(line);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadUser(String alias) {
        for (UserAccount user : users) {
            if (user.getAlias().equals(alias)) {
                currentUser = user;
                break;
            }
        }
    }

    public static void publishTweet(String message) {
        try {
            Tweet tweet = new Tweet(message, currentUser);
            currentUser.tweet(tweet);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sortUsersByEmail() {
        users.sort(Comparator.comparing(UserAccount::getEmail));
    }
    private static void createUsersFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"))) {
            writer.write("Juan,Juan@gmail.com\n");
            writer.write("Pablo,Pablo@gmail.com\n");
            writer.write("Nacho,Nacho@gmail.com\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UserAccount getCurrentUser() {
        return currentUser;
    }
}