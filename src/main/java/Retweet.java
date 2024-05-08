public class Retweet extends Tweet {
    private Tweet retweetedTweet;

    public Retweet(String message, UserAccount sender, Tweet retweetedTweet) {
        super(message, sender);
        this.retweetedTweet = retweetedTweet;
    }

    public Tweet getRetweetedTweet() {
        return retweetedTweet;
    }
}
