package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testSquare() {
        App app = new App();
        assertEquals(49, app.square(7));
    }
}
