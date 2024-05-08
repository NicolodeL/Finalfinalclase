import java.util.*;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet> tweets;
    private List<Tweet> timeline;
    private Set<UserAccount> followers;
    private Set<UserAccount> following;

    public UserAccount(String alias, String email) {

        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("Invalid alias");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.timeline = new ArrayList<>();
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
    }
    public void follow(UserAccount otherUser) {
        if (this.following.contains(otherUser)) {
            throw new IllegalArgumentException("You are already following this user");
        }
        this.following.add(otherUser);
        otherUser.addFollower(this);
    }

    private void addFollower(UserAccount follower) {
        this.followers.add(follower);
    }
    public void tweet(Tweet tweet) {
        this.tweets.add(tweet);
        for (UserAccount follower : this.followers) {
            follower.addToTimeline(tweet);
        }
    }

    private void addToTimeline(Tweet tweet) {
        this.timeline.add(tweet);
    }
    @Override
    public String toString() {
        return "UserAccount{" +
                "alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static UserAccount fromString(String userString) {
        String[] parts = userString.split(",");
        return new UserAccount(parts[0], parts[1]);
    }

    public Object getAlias() {
        return alias;
    }

    public <U> U getEmail() {
        return (U) email;
    }
}




