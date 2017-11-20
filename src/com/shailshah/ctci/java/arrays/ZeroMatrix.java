package com.shailshah.ctci.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
    public void unsetRowAndColsOfZeroVal(int[][] a) {
        int m = a.length;
        if(m == 0) return;
        int n = a[0].length;

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(a[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }

        for(int i = 0; i < rows.size(); i++) {
            int row = rows.get(i);
            for(int j = 0; j < n; j++)
                a[row][j] = 0;
        }

        for(int j = 0; j < cols.size(); j++) {
            int col = cols.get(j);
            for(int i = 0; i < m; i++)
                a[i][col] = 0;
        }
    }
}
