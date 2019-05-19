package com.happy;

import org.junit.Test;
import com.happy.Common.ListNode;

/**
 * 第19题 删除链表的倒数第N个节点
 *
 * @author qgl
 * @date 2019/05/19
 */
public class Test19 {
    @Test
    public void test19() {
        RemoveNthFromListEnd19 removeNthFromListEnd19 = new RemoveNthFromListEnd19();
        ListNode head = new ListNode(2);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(3);
        head.next = two;
        two.next = three;
        int n = 3;

        System.out.println("删除前的链表 " + Common.printListNode(head));
        ListNode removeNode = removeNthFromListEnd19.removeNthFromEnd(head, n);
        System.out.println("删除倒数第" + n + "个节点后的链表 " + Common.printListNode(removeNode));
    }

}
