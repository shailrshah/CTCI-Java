package com.shailshah.ctci.java.utils;

public class StringUtils {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s, int i, int j) {
        if(i == j) return true;
        int start = i;
        int end = j;
        if(i < 0 || j >= s.length()) throw new IllegalArgumentException();
        while(start < end) if(s.charAt(start++) != s.charAt(end--)) return false;
        return true;
    }

    public boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length()-1);
    }

    public int countFrequency(String s, char ch, int start, int end) {
        int count = 0;
        if(s.length() <= end) throw new IllegalArgumentException();
        for(int i = start; i < end; i++)
            if(s.charAt(i) == ch) count++;

        return count;
    }
}
