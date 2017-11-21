package com.shailshah.ctci.solutions.stringsarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {
    private  PalindromePermutation obj;

    @Before
    public void setup() {
        obj = new PalindromePermutation();
    }
    @Test
    public void palindromePermutation() throws Exception {
        assertTrue(obj.palindromePermutation("llo"));
        assertTrue(obj.palindromePermutation(""));
        assertTrue(obj.palindromePermutation("o"));
        assertTrue(obj.palindromePermutation("Taco cat"));
    }

}