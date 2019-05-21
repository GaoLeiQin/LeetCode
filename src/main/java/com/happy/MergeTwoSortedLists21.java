package com.happy;

import com.happy.Common.ListNode;

/**
 * 第21题 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author qgl
 * @date 2019/05/21
 */
public class MergeTwoSortedLists21 {
    /**
     * 解法一：递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode newHead = null;
        if (l1.val < l2.val) {
            newHead = l1;
            newHead.next = mergeTwoLists(l1.next, l2);
        } else {
            newHead = l2;
            newHead.next = mergeTwoLists(l1, l2.next);
        }
        return newHead;
    }

    /**
     * 解法二：非递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode result = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                newHead.next = l1;
                l1 = l1.next;
            } else {
                newHead.next = l2;
                l2 = l2.next;
            }
            newHead = newHead.next;
        }

        if (l1 == null) {
            newHead.next = l2;
        } else {
            newHead.next = l1;
        }
        return result.next;
    }
}
