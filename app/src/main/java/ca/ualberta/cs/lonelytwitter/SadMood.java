package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rderbysh on 9/14/17.
 */

public class SadMood extends CurrentMood {

    public SadMood(String mood) {
        super(mood);
    }

    public SadMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public String emojiFormat() {
        return ":(";
    }
}
