package com.shailshah.ctci.java.solutions.stringsarrays;

public class StringCompression{
    public String getCompressedString(String s) {
        int n = s.length();
        if(n < 2) return s;

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < n) {
            char ch = s.charAt(i);
            int count = 0;
            while(i < n && s.charAt(i) == ch) {
                i++;
                count++;
            }
            sb.append(ch);
            sb.append(count);
        }

        return sb.length() < n ? sb.toString() : s;
    }
}
