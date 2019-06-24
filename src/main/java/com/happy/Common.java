package com.happy;

import java.util.Arrays;

/**
 * 公共的类和方法
 *
 * @author qgl
 * @date 2019/05/19
 */
public class Common {
    /**
     * 二叉树
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

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

    /**
     * 打印二维矩阵
     * @param matrix
     * @return
     */
    public static String printTwoMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int[] a : matrix) {
            sb.append(Arrays.toString(a)).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}
