package com.happy;

/**
 * 第2题
 * 给出两个非空链表表示两个非负的整数。
 * 其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * @author qgl
 * @date 2019/04/26
 */
public class AddTwoListNumbers2 {

    /**
     * 链表
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 两个链表求和
     * 时间复杂度：O(max(m, n)),空间复杂度：O(max(m, n))
     * m = head1.length, n = head2.length,
     *
     * @param head1
     * @param head2
     * @return
     */
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode sumNode = new ListNode(0);
        ListNode curr = sumNode;
        int carry = 0;
        while (head1 != null || head2 != null) {
            int a = (head1 == null) ? 0 : head1.val;
            int b = (head2 == null) ? 0 : head2.val;
            int sum = a + b + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (head1 != null) {
                head1 = head1.next;
            }
            if (head2 != null) {
                head2 = head2.next;
            }
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return sumNode.next;
    }
}
