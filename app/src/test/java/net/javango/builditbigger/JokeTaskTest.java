package net.javango.builditbigger;

import org.junit.Test;

import static org.junit.Assert.*;

public class JokeTaskTest {
    @Test
    public void retrieveJoke() {
        MainActivity.JokeAsyncTask task = new MainActivity.JokeAsyncTask(null);
        String joke = task.doInBackground();
        assertNotNull(joke);
    }
}