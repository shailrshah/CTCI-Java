package com.shailshah.ctci.utils;

import com.shailshah.ctci.datastructs.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeUtilsTest {
    private ListNodeUtils listNodeUtils;
    ListNode mockedListNode;
    @Before
    public void setUp() throws Exception {
        listNodeUtils = new ListNodeUtils();

        mockedListNode= new ListNode(1);
        listNodeUtils.append(mockedListNode, 2);
        listNodeUtils.append(mockedListNode, 3);
    }

    @Test
    public void getLength() throws Exception {
        assertEquals(3, listNodeUtils.getLength(mockedListNode));
        assertEquals(0, listNodeUtils.getLength(null));
    }

    @Test
    public void reverse() throws Exception {
        ListNode head = listNodeUtils.copyListNode(mockedListNode);
        head = listNodeUtils.reverse(head);
        assertEquals(3, listNodeUtils.getLength(head));
        assertEquals(3, head.val);
        assertEquals(2, head.next.val);
        assertEquals(1, head.next.next.val);

        head = listNodeUtils.reverse(head);
        assertEquals(3, listNodeUtils.getLength(head));
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);

        assertEquals(null, listNodeUtils.reverse(null));
        assertEquals(1, listNodeUtils.reverse(new ListNode(1)).val);
    }

    @Test
    public void append() throws Exception {
        ListNode head = new ListNode(1);
        listNodeUtils.append(head, 2);
        listNodeUtils.append(head, 3);
        assertEquals(3, listNodeUtils.getLength(head));
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertNull(head.next.next.next);
    }

    @Test
    public void addToFront() throws Exception {
        ListNode head = listNodeUtils.copyListNode(mockedListNode);
        head = listNodeUtils.addToFront(head, 10);
        assertEquals(4, listNodeUtils.getLength(head));
        assertEquals(10, head.val);

        head = listNodeUtils.addToFront(null, 10);
        assertEquals(1, listNodeUtils.getLength(head));
        assertEquals(10, head.val);
    }
}