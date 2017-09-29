/*
 * Interface Name: Tweetable
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
 * Represents a tweetable Tweet
 *
 * @author Randi Derbyshire
 *@version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweet
 * @see LonelyTwitterActivity
 * @since 1.0
 */

public interface Tweetable {

    /**
     * Gets the tweetable message
     * @return
     */
    public String getMessage();

    /**
     * Gets the date at the time of tweet
     * @return
     */
    public Date getDate();
}
