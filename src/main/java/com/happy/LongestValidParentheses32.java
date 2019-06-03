package com.happy;

import java.util.Stack;

/**
 * 第32题 最长有效括号
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 * @author qgl
 * @date 2019/06/02
 */
public class LongestValidParentheses32 {
    /**
     * 解法一：利用栈
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }

        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    /**
     * 解法二：双指针法
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param s
     * @return
     */
    public int longestValidParentheses2(String s) {
        int left = 0, right = 0, maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }

        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxLength;
    }

    /**
     * 解法三：动态规划
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param s
     * @return
     */
    public int longestValidParentheses3(String s) {
        int maxLength = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxLength = Math.max(maxLength, dp[i]);
            }
        }
        return maxLength;
    }
}
