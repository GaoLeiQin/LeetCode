package com.happy;

import org.junit.Test;
import com.happy.Common.ListNode;

/**
 * 第23题 合并K个排序链表（hard）
 *
 * @author qgl
 * @date 2019/05/23
 */
public class Test23 {
    @Test
    public void test23() {
        MergeKSortedLists23 mergekSortedLists23 = new MergeKSortedLists23();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(4);
        head.next = two;
        two.next = three;

        ListNode head2 = new ListNode(1);
        ListNode two2 = new ListNode(3);
        ListNode three2 = new ListNode(4);
        head2.next = two2;
        two2.next = three2;

        ListNode head3 = new ListNode(2);
        ListNode two3 = new ListNode(6);
        head3.next = two3;

        ListNode[] listNodes = {head, head2, head3};
        ListNode mergeList = mergekSortedLists23.mergeKLists(listNodes);
        System.out.println("合并K个排序链表的结果: " + Common.printListNode(mergeList));
    }

}
