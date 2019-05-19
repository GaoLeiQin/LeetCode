package com.happy;

/**
 * 公共的类和方法
 *
 * @author qgl
 * @date 2019/05/19
 */
public class Common {
    /**
     * 链表
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 打印链表
     * @param head
     * @return
     */
    public static String printListNode(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" → ");
            head = head.next;
        }
        return sb.length() < 1 ? null : sb.substring(0, sb.length() - 2);
    }
}
