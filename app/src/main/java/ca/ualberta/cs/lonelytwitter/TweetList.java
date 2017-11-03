package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


// Made it package private
class TweetList {
    // Added a final modifier to tweets list.
    private final ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    // paramter of index is always 0, so don't need to put index in it.
    public Tweet getTweet(){
        return tweets.get(0);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
