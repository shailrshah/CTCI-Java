package com.shailshah.ctci.java.solutions.stringsarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {
    private  OneAway obj;

    @Before
    public void setup() {
        obj = new OneAway();
    }

    @Test
    public void isOneAway() throws Exception {
        assertTrue(obj.isOneAway("yes", "yes"));
        assertTrue(obj.isOneAway("yes", "yess"));
        assertTrue(obj.isOneAway("pop", "pup"));
        assertTrue(obj.isOneAway("yess", "yes"));
        assertFalse(obj.isOneAway("nope", "no"));
        assertFalse(obj.isOneAway("no", "nope"));
        assertFalse(obj.isOneAway("pup", "pope"));
    }
}