package com.happy;

import com.happy.Common.ListNode;

/**
 * 第19题 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n个节点，并且返回链表的头结点。
 *
 * @author qgl
 * @date 2019/05/19
 */
public class RemoveNthFromListEnd19 {
    /**
     * 使用双指针，一次遍历。
     * 时间复杂度：O(n)，空间复杂度：O(1)，其中 n=LostNode.length
     *
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }

        ListNode result = new ListNode(0);
        result.next = head;
        ListNode fast = result;
        ListNode slow = result;
        while (n-- >= 0) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return result.next;
    }
}
