package com.shailshah.ctci.java.utils;

public class NumUtils {
    public boolean isPrime(int n) {
        if(n < 2) return false;

        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i == 0)
                return false;

        return true;
    }

    public int[] getPrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        for(int i = 2; count < n; i++)
            if(isPrime(i))
                primes[count++] = i;

        return primes;
    }
}
