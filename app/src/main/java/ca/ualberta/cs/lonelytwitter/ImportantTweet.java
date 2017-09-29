/*
 * Class Name: ImportantTweet
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
 * Represents an important Tweet
 *
 * @author Randi Derbyshire
 *@version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweet
 * @see Tweetable
 * @since 1.0
 */

public class ImportantTweet extends Tweet {

    /**
     * constructs an important tweet
     * @param message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructs an important tweet
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
