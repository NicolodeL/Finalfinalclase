public class Email {
    private String emailAddress;

    public Email(String emailAddress) {
        if (!Utils.isValidEmail(emailAddress)) {
            public String getEmailAddress() {
                return emailAddress;
                throw new IllegalArgumentException("Invalid email address");
            }
            this.emailAddress = emailAddress;
        }

    }
}