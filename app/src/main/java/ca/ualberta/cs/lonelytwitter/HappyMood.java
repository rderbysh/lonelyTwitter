package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rderbysh on 9/14/17.
 */

public class HappyMood extends CurrentMood {

    public HappyMood(String mood) {
        super(mood);
    }

    public HappyMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public String emojiFormat() {
        return ":)";
    }
}
