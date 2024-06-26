package Interacciones;

import Usuario.Utils;

public class Email {
    private String emailAddress;

    public Email(String emailAddress) {
        if (!Utils.isValidEmail(emailAddress)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}