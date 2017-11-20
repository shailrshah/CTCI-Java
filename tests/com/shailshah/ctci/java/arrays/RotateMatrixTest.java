package com.shailshah.ctci.java.arrays;

import javafx.scene.transform.Rotate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {
    private RotateMatrix obj;
    @Before
    public void setUp() throws Exception {
        obj = new RotateMatrix();
    }

    @Test
    public void rotateMatrix() throws Exception {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] right = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int [][] left = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
        assertArrayEquals(right, obj.rotateMatrix(a, true));
        assertArrayEquals(left, obj.rotateMatrix(obj.rotateMatrix(a, false), false));

        int[][] b = {{1, 2, 3}, {4, 5, 6}};
        int[][] rightB = {{4, 1}, {5, 2}, {6, 3}};
        int[][] leftB = {{3, 6}, {2, 5}, {1, 4}};

        assertArrayEquals(rightB, obj.rotateMatrix(b, true));
        assertArrayEquals(leftB, obj.rotateMatrix(b, false));
    }

}