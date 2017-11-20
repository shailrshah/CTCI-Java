package Utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    StringUtils stringUtils = new StringUtils();

    @Test
    public void reverse() throws Exception {
        assertEquals("cba", stringUtils.reverse("abc"));
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    public void isPalindrome() throws Exception {
        assertTrue(stringUtils.isPalindrome("", 0, 0));
        assertTrue(stringUtils.isPalindrome("sos", 0, 2));
        assertTrue(stringUtils.isPalindrome("blood", 2, 3));

        assertFalse(stringUtils.isPalindrome("max", 0, 2));
        assertFalse(stringUtils.isPalindrome("blood", 0, 4));
    }
}