package com.shailshah.ctci.java.solutions.stringsarrays;

import com.shailshah.ctci.java.utils.BitUtils;

public class PalindromePermutation {
    public boolean palindromePermutation(String s) {
        BitUtils bitUtils = new BitUtils();
        int n = s.length();
        if(n < 2) return true;

        int mask = 0;

        for(int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == ' ') continue;
            mask = bitUtils.toggleBit(mask, ch - 'a');
        }

        return bitUtils.getNumberOfSetBits(mask) <= 1;
    }
}
