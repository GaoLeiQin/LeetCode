package com.happy;

import java.util.Stack;

/**
 * 第20题 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：左括号必须用相同类型的右括号闭合。左括号必须以正确的顺序闭合。
 * 注:空字符串可被认为是有效字符串。
 *
 * @author qgl
 * @date 2019/05/20
 */
public class ValidParentheses20 {
    /**
     * 利用栈判断
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.size() > 0 && isSpecialParenthesis(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    /**
     * 是否是特殊的括号
     * @param c1 栈中的字符
     * @param c2 原字符串中的字符
     * @return
     */
    private boolean isSpecialParenthesis(char c1, char c2) {
        return c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']';
    }
}
