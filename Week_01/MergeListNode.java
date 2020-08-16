package com.sioo.discover.api.test;

import lombok.ToString;

/**
 * @author : xywei
 * @date : 2020-08-14
 */
public class MergeListNode {

    @ToString
    class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Merge Two ListNode
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    /**
     * Test
     *
     * @param args
     */
    public static void main(String[] args) {
        //l1
        ListNode l1 = new MergeListNode().new ListNode(1);
        l1.next = new MergeListNode().new ListNode(2);
        l1.next.next = new MergeListNode().new ListNode(4);

        //l2
        ListNode l2 = new MergeListNode().new ListNode(1);
        l2.next = new MergeListNode().new ListNode(3);
        l2.next.next = new MergeListNode().new ListNode(4);

        ListNode result = MergeListNode.mergeTwoLists(l1, l2);
        System.out.println(result);
    }
}
