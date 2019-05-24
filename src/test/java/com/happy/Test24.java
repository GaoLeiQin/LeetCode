package com.happy;

import com.happy.Common.ListNode;
import org.junit.Test;

/**
 * 第24题 两两交换链表中的节点
 *
 * @author qgl
 * @date 2019/05/24
 */
public class Test24 {
    @Test
    public void test24() {
        SwapNodesInPairs24 swapNodesInPairs24 = new SwapNodesInPairs24();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(8);
        head.next = two;
        two.next = three;
        three.next = four;

        ListNode swapList = swapNodesInPairs24.swapPairs(head);
        System.out.println("解法一：两两交换节点后的链表: " + Common.printListNode(swapList));
//        ListNode swapList2 = swapNodesInPairs24.swapPairs2(head);
//        System.out.println("解法二：两两交换节点后的链表: " + Common.printListNode(swapList2));
    }

}
