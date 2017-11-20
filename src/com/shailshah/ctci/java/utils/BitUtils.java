package com.shailshah.ctci.java.utils;

public class BitUtils {
    public boolean isSet(int mask, int i) {
        return ((1 << i) & mask) > 0;
    }

    public int setBit(int mask, int i) {
        return (1 << i) | mask;
    }

    public int unsetBit(int mask, int i) {
        return ~(1 << i) & mask;
    }

    public int toggleBit(int mask, int i) {
        return (1 << i) ^ mask;
    }

    public int getNumberOfSetBits(int mask) {
        int count = 0;
        int n = mask;

        while(n != 0) {
            n &= (n-1);
            count++;
        }

        return count;
    }
}
