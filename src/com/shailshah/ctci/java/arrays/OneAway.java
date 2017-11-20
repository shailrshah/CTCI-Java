package com.shailshah.ctci.java.arrays;

public class OneAway {
    public boolean isOneAway(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1==0 && n2==0) return true;
        if(Math.abs(n1-n2) > 1) return false;
        if(n2 > n1) return isOneAway(s2, s1);

        boolean isOneDiff = false;
        for(int i1 = 0, i2 = 0; i2 < n2; i1++, i2++) {
            char ch1 = s1.charAt(i1);
            char ch2 = s2.charAt(i2);

            if(ch1 == ch2) continue;
            if(!isOneDiff) {
                if(n1 > n2) i1++;
                isOneDiff = true;
            }
            else return false;
        }

        return true;
    }
}
