package com.shailshah.ctci.java.utils;

import com.shailshah.ctci.java.datastructs.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeUtilsTest {
    private ListNodeUtils listNodeUtils;
    @Before
    public void setUp() throws Exception {
        listNodeUtils = new ListNodeUtils();
    }

    @Test
    public void getLength() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        assertEquals(3, listNodeUtils.getLength(head));
        assertEquals(0, listNodeUtils.getLength(null));
    }

    @Test
    public void reverse() throws Exception {
        assertEquals(null, listNodeUtils.reverse(null));
        ListNode head = new ListNode(1);
        assertEquals(1, listNodeUtils.reverse(head).val);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = listNodeUtils.reverse(head);
        assertEquals(3, listNodeUtils.getLength(head));
        assertEquals(3, head.val);
        assertEquals(2, head.next.val);
        assertEquals(1, head.next.next.val);
    }
}