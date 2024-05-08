import java.time.LocalDate;

public class Tweet {
    private String message;
    private UserAccount sender;
    private LocalDate time;

    public Tweet(String message, UserAccount sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("Message exceeds the maximum length of 140 characters");
        }
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
    @Override
    public String toString() {
        return "Tweet{" +
                "message='" + message + '\'' +
                ", sender=" + sender +
                ", time=" + time +
                '}';
    }
}