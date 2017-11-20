package Arrays;
import Utils.BitUtils;

public class IsUnique {
    public boolean isUnique(String s) {
        BitUtils bitUtils = new BitUtils();
        int mask = 0;

        for(int i = 0; i < s.length(); i++) {
            int n = Character.toLowerCase(s.charAt(i)) - 'A';
            if(bitUtils.isSet(mask, n)) return false;
            else mask = bitUtils.setBit(mask, n);
        }

        return true;
    }
}
