package com.shailshah.ctci.java.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMatrixTest {
    private ZeroMatrix obj;
    @Before
    public void setUp() throws Exception {
        obj = new ZeroMatrix();
    }

    @Test
    public void unsetRowAndColsOfZeroVal() throws Exception {
        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] r = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        obj.unsetRowAndColsOfZeroVal(a);
        assertArrayEquals(a, r);

        int[][] b = {{0, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] z = {{0, 0, 0, 0, 0}, {0, 7, 8, 9, 10}};
        obj.unsetRowAndColsOfZeroVal(b);
        assertArrayEquals(a, r);
    }

}