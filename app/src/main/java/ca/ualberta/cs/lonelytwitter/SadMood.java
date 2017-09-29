/*
 * Class Name: SadMood
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
 * Represents a sad mood
 *
 * @author Randi Derbyshire
 *@version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see CurrentMood
 * @see HappyMood
 * @since 1.0
 */

public class SadMood extends CurrentMood {

    /**
     * constructs a sad mood
     * @param mood
     */
    public SadMood(String mood) {
        super(mood);
    }

    /**
     * Constructs a sad mood
     * @param mood
     * @param date
     */
    public SadMood(String mood, Date date) {
        super(mood, date);
    }

    /**
     * Provides the string format for the moods
     * @return
     */
    @Override
    public String emojiFormat() {
        return ":(";
    }
}
