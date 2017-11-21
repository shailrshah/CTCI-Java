package com.shailshah.ctci.utils;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class NumUtilsTest {
    private NumUtils numUtils;

    @Before
    public void setup() {
        numUtils = new NumUtils();
    }

    @Test
    public void isPrime() throws Exception {
        assertFalse(numUtils.isPrime(0));
        assertFalse(numUtils.isPrime(1));
        assertTrue(numUtils.isPrime(2));
        assertTrue(numUtils.isPrime(3));
        assertFalse(numUtils.isPrime(4));
        assertTrue(numUtils.isPrime(17));
        assertFalse(numUtils.isPrime(100));
        assertFalse(numUtils.isPrime(99));
    }

    @Test
    public void getPrimes() throws Exception {
        assertEquals(numUtils.getPrimes(2).length, 2);
        assertEquals(numUtils.getPrimes(0).length, 0);
        assertTrue(Arrays.equals(numUtils.getPrimes(26), new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101}));
    }
}