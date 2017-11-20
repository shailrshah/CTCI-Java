package com.shailshah.ctci.java.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {
    private CheckPermutation obj;

    @Before
    public void setup() {
        obj = new CheckPermutation();
    }

    @Test
    public void isPermutation() throws Exception {
        assertTrue(obj.isPermutation("", ""));
        assertTrue(obj.isPermutation("abc", "cba"));
        assertFalse(obj.isPermutation("abc", "cbaz"));
        assertFalse(obj.isPermutation("abc", "cbd"));
    }
}
