package com.devinzimmer.app;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testSum() {
        int x = App.sum(1, 2);
        assertEquals(3, x);
    }
}
