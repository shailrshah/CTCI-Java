package com.shailshah.ctci.java.utils;

import com.shailshah.ctci.java.datastructs.ListNode;

public class ListNodeUtils {
    public int getLength(ListNode head) {
        int count = 0;
        ListNode help = head;

        while(help != null) {
            count++;
            help = help.next;
        }

        return count;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
