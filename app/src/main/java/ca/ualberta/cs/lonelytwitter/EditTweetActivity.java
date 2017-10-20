package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet2);

        Bundle activity = getIntent().getExtras();
        String extras = activity.getString("Test tweet message");

        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(extras);
    }
}
