/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X/ CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Randi Derbyshire
 *@version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     * @param date tweet date
     */


    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Sets tweet dates
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Sets tweet messages
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets the tweet date
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * Gets the tweet date
     * @return
     */
    public String getMessage(){
        return message;
    }

    /**
     * Boolean to set is tweet is important
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Sets the tweet mood list
     * @param moodList
     */
    public void setMoodList(ArrayList<CurrentMood> moodList) {
        this.moodList = moodList;
    }

    /**
     * Gets the tweet mood list
     * @return
     */
    public ArrayList<CurrentMood> getMoodList() { return moodList; }

    /**
     * How the tweet is displayed in a string
     * @return
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
