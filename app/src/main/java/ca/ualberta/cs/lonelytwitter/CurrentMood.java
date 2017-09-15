package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rderbysh on 9/14/17.
 */

public abstract class CurrentMood {

    private String mood;
    private Date date;

    public CurrentMood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public CurrentMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public void setDate(Date date) { this.date = date; }

    public Date getDate(){
        return date;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public abstract String emojiFormat();
}
