package Utils;

public class StringUtils {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s, int i, int j) {
        if(i == j) return true;
        if(i < 0 || j >= s.length()) throw new IllegalArgumentException();
        while(i < j) if(s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
}
