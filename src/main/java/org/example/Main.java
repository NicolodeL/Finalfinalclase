package org.example;

import Interacciones.Tweet;
import Usuario.UserAccount;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
    private static List<UserAccount> users = new ArrayList<>();
    private static UserAccount currentUser;

    public static void main(String[] args) {
        loadUsersFromFile();
        // Implementar el menú aquí
    }

    private static void loadUsersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                UserAccount user = UserAccount.fromString(line);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadUser(String alias) {
        for (UserAccount user : users) {
            if (user.getAlias().equals(alias)) {
                currentUser = user;
                break;
            }
        }
    }

    private static void publishTweet(String message) {
        try {
            Tweet tweet = new Tweet(message, currentUser);
            currentUser.tweet(tweet);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void sortUsersByEmail() {
        users.sort(Comparator.comparing(UserAccount::getEmail));
    }
}