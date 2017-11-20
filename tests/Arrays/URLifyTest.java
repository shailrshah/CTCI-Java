package Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {
    URLify obj = new URLify();
    @Test
    public void urlify() throws Exception {
        assertEquals("Mr%20John%20Smith", obj.urlify(new char[]{'M','r',' ', 'J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' ', ' ', ' ', ' '}, 13));
        assertEquals("", obj.urlify(new char[]{}, 0));
    }
}