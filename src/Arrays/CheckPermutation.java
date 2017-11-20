package Arrays;

import Utils.NumUtils;

public class CheckPermutation {
    int primes[];

    public boolean isPermutation(String s1, String s2) {
        NumUtils numUtils = new NumUtils();

        primes = numUtils.getPrimes(26);
        int n1 = s1.length(), n2 = s2.length();
        if(n1 != n2) return false;

        int mul1 = 1, mul2 = 1;
        for(int i = 0; i < n1; i++) {
            mul1 *= primes[s1.charAt(i)-'a'];
            mul2 *= primes[s2.charAt(i)-'a'];
        }

        return mul1 == mul2;
    }
}
