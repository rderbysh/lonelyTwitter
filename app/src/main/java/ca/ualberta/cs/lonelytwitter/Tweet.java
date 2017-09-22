package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by rderbysh on 9/14/17.
 */

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }

    public abstract Boolean isImportant();

    public void setMoodList(ArrayList<CurrentMood> moodList) {
        this.moodList = moodList;
    }

    public ArrayList<CurrentMood> getMoodList() { return moodList; }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
