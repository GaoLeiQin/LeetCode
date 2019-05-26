package com.happy;

import com.happy.Common.ListNode;
import org.junit.Test;

/**
 * 第25题 k个一组翻转链表（hard）
 *
 * @author qgl
 * @date 2019/05/25
 */
public class Test25 {
    @Test
    public void test25() {
        ReverseNodesInKGroup25 reverseNodesInKGroup25 = new ReverseNodesInKGroup25();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(8);
        head.next = two;
        two.next = three;
        three.next = four;

        int k = 3;
        ListNode swapList = reverseNodesInKGroup25.reverseKGroup(head, k);
        System.out.println("k个一组翻转链表后的结果: " + Common.printListNode(swapList));
    }

}
