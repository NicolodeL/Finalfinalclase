import java.time.LocalDate;

public class Tweet {
    private String message;
    private UserAccount sender;
    private LocalDate time;

    public Tweet(String message, UserAccount sender) {
        this.message = message;
        this.sender = sender;
        this.time = LocalDate.now();
    }

    public String getMessage() {
        return message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public LocalDate getTime() {
        return time;
    }
}