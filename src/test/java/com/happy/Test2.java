package com.happy;

import com.happy.AddTwoListNumbers2.ListNode;
import org.junit.Test;

/**
 * 第2题
 * 给出两个非空链表表示两个非负的整数。
 * 其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * @author qgl
 * @date 2019/04/26
 */
public class Test2 {
    @Test
    public void test2() {
        AddTwoListNumbers2 addTwoNumbers2 = new AddTwoListNumbers2();
        ListNode head = new ListNode(2);
        ListNode two = new ListNode(4);
        ListNode three = new ListNode(3);
        head.next = two;
        two.next = three;

        ListNode head2 = new ListNode(5);
        ListNode two2 = new ListNode(6);
        ListNode three2 = new ListNode(4);
        head2.next = two2;
        two2.next = three2;

        ListNode sumList = addTwoNumbers2.addTwoNumbers(head, head2);
        System.out.println("使用辅助链表求和：" + printListNode(sumList));
    }

    /**
     * 打印链表
     * @param head
     * @return
     */
    public String printListNode(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" → ");
            head = head.next;
        }
        return sb.substring(0, sb.length() - 2);
    }
}
