package com.shailshah.ctci.solutions.stringsarrays;

import com.shailshah.ctci.utils.StringUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsUniqueTest {
    private IsUnique obj;

    @Before
    public void setup() {
        obj = new IsUnique();
    }

    @Test
    public void reverse() throws Exception {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String reversedAlphabets = new StringUtils().reverse(alphabets);
        assertTrue(obj.isUnique(alphabets));
        assertTrue(obj.isUnique(reversedAlphabets));
        assertFalse(obj.isUnique(alphabets+"a"));
        assertFalse(obj.isUnique(alphabets+"A"));
    }
}