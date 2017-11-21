package com.shailshah.ctci.solutions.stringsarrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {
    private  StringCompression obj;

    @Before
    public void setup() {
        obj = new StringCompression();
    }

    @Test
    public void getCompressedString() throws Exception {
        assertEquals("a2b3c4", obj.getCompressedString("aabbbcccc"));
        assertEquals("abcd", obj.getCompressedString("abcd"));
        assertEquals("", obj.getCompressedString(""));
        assertEquals("a", obj.getCompressedString("a"));
        assertEquals("a10", obj.getCompressedString("aaaaaaaaaa"));
    }
}