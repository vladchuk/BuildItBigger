package net.javango.jokeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String ARG_JOKE = "net.javango.jokeactivity.joke";

    public static Intent newIntent(Context context, String joke) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(ARG_JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.joke_label);
        setContentView(R.layout.activity_joke);
        String joke = getIntent().getExtras().getString(ARG_JOKE);
        TextView jokeView = findViewById(R.id.text_joke);
        jokeView.setText(joke);
    }
}
