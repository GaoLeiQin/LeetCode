package com.happy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 第139题 单词拆分
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 说明：拆分时可以重复使用字典中的单词。可以假设字典中没有重复的单词。
 *
 * @author qgl
 * @date 2019/07/11
 */
public class WordBreak139 {
    /**
     * 动态规划
     * 时间复杂度：O(n²)，空间复杂度：O(n)
     *
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int n = s.length();
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
