package com.shailshah.ctci.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {
    private ArrayUtils arrayUtils;

    @Before
    public void setup() {
        arrayUtils = new ArrayUtils();
    }

    @Test
    public void transpose() throws Exception {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] t = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        arrayUtils.transpose(a);
        assertArrayEquals(t, a);
    }

    @Test
    public void reverseEachRow() throws Exception {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] r = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        arrayUtils.reverseEachRow(a);
        assertArrayEquals(r, a);
    }

    @Test
    public void reverseEachCol() throws Exception {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] r = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        arrayUtils.reverseEachCol(a);
        assertArrayEquals(r, a);
    }

    @Test
    public void swap() throws Exception {
        int[] a = {1, 2, 3};
        int[] s = {1, 3, 2};
        arrayUtils.swap(a, 1, 2);
        assertArrayEquals(s, a);

        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] r = {{1, 6, 3}, {4, 5, 2}, {7, 8, 9}};
        arrayUtils.swap(b, 0, 1,1, 2);
        assertArrayEquals(r, b);
    }
}