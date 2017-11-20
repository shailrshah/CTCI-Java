package com.shailshah.ctci.java.solutions.stringsarrays;

import com.shailshah.ctci.java.utils.ArrayUtils;

public class RotateMatrix {
    public int[][] rotateMatrix(int[][] a, boolean isRightRotate) {
        int m = a.length;
        if(m == 0) return a;
        int n = a[0].length;
        return m == n ? rotateSquareMatrix(a, isRightRotate) :
                        rotateRectMatrix(a, isRightRotate);
    }

    private int[][] rotateSquareMatrix(int[][] a, boolean isRightRotate) {
        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.transpose(a);
        if(isRightRotate)
            arrayUtils.reverseEachRow(a);
        else
            arrayUtils.reverseEachCol(a);

        return a;
    }

    private int[][] rotateRectMatrix(int[][] a, boolean isRightRotate) {
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[n][m];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                b[i][j] = isRightRotate? a[m-1-j][i] : a[j][n-1-i];

        return b;
    }
}
