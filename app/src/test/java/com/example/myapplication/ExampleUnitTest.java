package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect(){
        main m = new main();
        assertEquals(m.min(3,4 ), 3);
        assertEquals(m.min(3,3 ), 3);
        assertEquals(m.min(-1,0 ), -1);
        assertEquals(m.min(0,0 ), 0);

        assertEquals(m.max(3,4 ), 4);
        assertEquals(m.max(3,3 ), 3);
        assertEquals(m.max(-1,0 ), 0);
        assertEquals(m.max(0,0 ), 0);
    }
}
