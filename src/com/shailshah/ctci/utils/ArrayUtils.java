package com.shailshah.ctci.utils;

public class ArrayUtils {
    public void transpose(int[][] a) {
        int m = a.length;
        if(m == 0) return;
        int n = a[0].length;
        if(m != n) throw new IllegalArgumentException();
        for(int i = 0; i < m; i++)
            for(int j = 0; j < i; j++)
                swap(a, i, j, j, i);
    }

    public void reverseEachRow(int[][] a) {
        int m = a.length;
        if(m == 0) return;
        int n = a[0].length;

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n/2; j++)
                swap(a, i, j, i, n-1-j);
    }

    public void reverseEachCol(int[][] a) {
        int m = a.length;
        if(m == 0) return;
        int n = a[0].length;

        for(int i = 0; i < m/2; i++)
            for(int j = 0; j < n; j++)
                swap(a, i, j, m-1-i, j);
    }

    public void swap(int[][]a, int i1, int j1, int i2, int j2) {
        int temp = a[i1][j1];
        a[i1][j1] = a[i2][j2];
        a[i2][j2] = temp;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
