package com.shailshah.ctci.utils;

import com.shailshah.ctci.datastructs.ListNode;

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

    public void append(ListNode head, int val) {
        ListNode help = head;
        while(help.next != null)
            help = help.next;
        help.next = new ListNode(val);
    }

    public ListNode addToFront(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public ListNode copyListNode(ListNode head1) {
        ListNode head2 = null;
        if(head1 == null) return head2;
        else head2 = new ListNode(head1.val);
        ListNode help1 = head1.next;
        ListNode help2 = head2;

        while(help1 != null) {
            help2.next = new ListNode(help1.val);
            help1 = help1.next;
            help2 = help2.next;
        }

        return head2;
    }
}
