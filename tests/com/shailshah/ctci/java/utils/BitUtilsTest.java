package com.shailshah.ctci.java.utils;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BitUtilsTest {
    private BitUtils bitUtils;

    @Before
    public void setup() {
        bitUtils = new BitUtils();
    }

    @Test
    public void isSet() throws Exception {
        assertTrue(bitUtils.isSet(1, 0));
        assertFalse(bitUtils.isSet(1, 1));

        assertFalse(bitUtils.isSet(0, 1));
    }

    @Test
    public void setBit() throws Exception {
        assertEquals(7, bitUtils.setBit(3, 2));
        assertEquals(3, bitUtils.setBit(3, 1));
    }

    @Test
    public void unsetBit() throws Exception {
        assertEquals(3, bitUtils.unsetBit(7, 2));
        assertEquals(7, bitUtils.unsetBit(7, 4));
    }

    @Test
    public void toggleBit() throws Exception {
        assertEquals(5, bitUtils.toggleBit(7, 1));
        assertEquals(1, bitUtils.toggleBit(0, 0));
    }

    @Test
    public void getNumberOfSetBits() throws Exception {
        assertEquals(1, bitUtils.getNumberOfSetBits(1));
        assertEquals(0, bitUtils.getNumberOfSetBits(0));
        assertEquals(3, bitUtils.getNumberOfSetBits(7));
        assertEquals(31, bitUtils.getNumberOfSetBits(Integer.MIN_VALUE-1));
        assertEquals(1, bitUtils.getNumberOfSetBits(Integer.MIN_VALUE));
        assertEquals(31, bitUtils.getNumberOfSetBits(Integer.MAX_VALUE));
    }
}
