package com.happy;

import org.junit.Test;

import com.happy.Common.ListNode;

/**
 * 第141题 给定一个链表，判断链表中是否有环
 *
 * @author qgl
 * @since 2021/1/24 16:27
 */
public class Test141 {
    @Test
    public void test141() {
        LinkedListCycle141 linkedListCycle141 = new LinkedListCycle141();
        System.out.println("链表中是否有环：" + linkedListCycle141.hasCycle(this.getListNode()));
    }

    private ListNode getListNode() {
        ListNode head = new ListNode(2);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(3);
        head.next = two;
        two.next = three;
        return head;
    }
}
