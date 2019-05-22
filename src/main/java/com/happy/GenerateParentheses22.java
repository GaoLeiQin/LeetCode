package com.happy;

import java.util.ArrayList;
import java.util.List;

/**
 * 第22题 括号生成
 * 给出 n代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * @author qgl
 * @date 2019/05/22
 */
public class GenerateParentheses22 {
    /**
     * 回溯法
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    /**
     * 递归
     *
     * @param result
     * @param cur
     * @param open
     * @param close
     * @param max
     */
    private void backtrack(List<String> result, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            result.add(cur);
            return;
        }

        if (open < max) {
            backtrack(result, cur + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, cur + ")", open, close + 1, max);
        }
    }
}
