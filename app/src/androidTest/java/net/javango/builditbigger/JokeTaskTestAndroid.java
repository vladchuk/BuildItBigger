package net.javango.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class JokeTaskTestAndroid {
    @Test
    public void retrieveJoke() {
        MainActivity.JokeFetchTask task = new MainActivity.JokeFetchTask(null);
        String joke = task.doInBackground();
        assertNotNull(joke);
        assertFalse("Task timed out!", joke.contains("timed out"));
    }
}