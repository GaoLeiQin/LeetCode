package com.happy;

import org.junit.Test;
import com.happy.Common.ListNode;

/**
 * 第21题 合并两个有序链表
 *
 * @author qgl
 * @date 2019/05/21
 */
public class Test21 {
    @Test
    public void test21() {
        MergeTwoSortedLists21 mergeTwoSortedLists21 = new MergeTwoSortedLists21();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(4);
        head.next = two;
        two.next = three;

        ListNode head2 = new ListNode(1);
        ListNode two2 = new ListNode(3);
        ListNode three2 = new ListNode(4);
        head2.next = two2;
        two2.next = three2;

        ListNode mergeList = mergeTwoSortedLists21.mergeTwoLists(head, head2);
        System.out.println("合并两个有序链表: " + Common.printListNode(mergeList));
    }

}
