/*
 * Class Name: NormalTweet
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
 * Represents a normal Tweet
 *
 * @author Randi Derbyshire
 *@version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweet
 * @see Tweetable
 * @since 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs a Normal Tweet
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a Normal Tweet
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
