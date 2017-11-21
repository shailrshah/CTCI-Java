package com.shailshah.ctci.solutions.stringsarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {
    private StringRotation obj;
    @Before
    public void setUp() {
        obj = new StringRotation();
    }

    @Test
    public void isRotated() throws Exception {
        assertTrue(obj.isRotated("waterbottle", "bottlewater"));
        assertTrue(obj.isRotated("abc", "cab"));
        assertTrue(obj.isRotated("a", "a"));
        assertTrue(obj.isRotated("abc", "abc"));
        assertTrue(obj.isRotated("", ""));

        assertFalse(obj.isRotated("abc", "bcd"));
        assertFalse(obj.isRotated("a", "b"));
        assertFalse(obj.isRotated("waterbottle", "waterbottle "));
    }

}