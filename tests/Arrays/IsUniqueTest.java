package Arrays;

import Utils.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsUniqueTest {
    IsUnique obj = new IsUnique();

    @Test
    public void reverse() throws Exception {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String reversedAlphabets = new StringUtils().reverse(alphabets);
        assertTrue(obj.isUnique(alphabets));
        assertTrue(obj.isUnique(reversedAlphabets));
        assertFalse(obj.isUnique(alphabets+"a"));
        assertFalse(obj.isUnique(alphabets+"A"));
    }
}