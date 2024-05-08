public class Tweet {
    private String message;
    private UserAccount author;

    public Tweet(String message, UserAccount author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public UserAccount getAuthor() {
        return author;
    }
}
