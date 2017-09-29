/*
 * Class Name: HappyMood
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
 * Represents a happy mood Tweet
 *
 * @author Randi Derbyshire
 *@version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see ca.ualberta.cs.lonelytwitter.CurrentMood
 * @see SadMood
 * @since 1.0
 */

public class HappyMood extends CurrentMood {

    /**
     * Sets the happy mood
     * @param mood
     */
    public HappyMood(String mood) {
        super(mood);
    }

    /**
     * Sets the happy mood
     * @param mood
     * @param date
     */
    public HappyMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public String emojiFormat() {
        return ":)";
    }
}
