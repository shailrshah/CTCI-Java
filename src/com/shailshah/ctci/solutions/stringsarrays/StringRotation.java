package com.shailshah.ctci.solutions.stringsarrays;

public class StringRotation {
    public boolean isRotated(String s1, String s2) {
        return (s1.length() == s2.length()) &&
                (s1 + s1).contains(s2);
    }
}
