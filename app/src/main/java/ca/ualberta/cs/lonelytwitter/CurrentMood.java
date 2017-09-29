/*
 * Class Name: CurrentMood
 *
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X/ CMPUT 301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents the current mood
 *
 * @author Randi Derbyshire
 *@version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see HappyMood
 * @see SadMood
 * @since 1.0
 */

public abstract class CurrentMood {

    private String mood;
    private Date date;

    /**
     * Constructs Current Mood objects
     * @param mood
     */
    public CurrentMood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    /**
     * Constructs Current Mood objects
     * @param mood
     * @param date
     */
    public CurrentMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * Sets date of current mood
     * @param date
     */
    public void setDate(Date date) { this.date = date; }

    /**
     * Gets date of current mood
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets current mood
     * @param mood
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * Gets current mood
     * @return
     */
    public String getMood() {
        return mood;
    }

    public abstract String emojiFormat();
}
