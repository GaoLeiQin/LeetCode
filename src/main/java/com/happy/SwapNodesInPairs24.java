package com.happy;

import com.happy.Common.ListNode;

/**
 * 第24题 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * @author qgl
 * @date 2019/05/24
 */
public class SwapNodesInPairs24 {
    /**
     * 解法一：直接交换节点值
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (head != null) {
            if (head.next != null) {
                ListNode tmp = head.next;
                p.next = tmp;
                head.next = head.next.next;
                tmp.next = head;
                p = p.next.next;
            } else {
                p.next = head;
            }
            head = head.next;
        }
        return dummy.next;
    }

    /**
     * 解法二：递归
     *
     * @param head
     * @return
     */
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;
        head.next = swapPairs(head.next.next);
        result.next = head;
        return result;
    }
}
