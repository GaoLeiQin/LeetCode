package com.happy;

/**
 * 第10题 正则表达式匹配
 * 给定一个字符串s和一个字符模式p。实现支持'.'和'*'的正则表达式匹配。
 *
 * @author qgl
 * @date 2019/05/10
 */
public class RegularExpressionMatching10 {
    /**
     * 解法一：递归
     *
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        return matchIndex(s.toCharArray(), p.toCharArray(), 0, 0);
    }

    /**
     * 递归的匹配每一个字符
     *
     * @param s
     * @param p
     * @param indexS
     * @param indexP
     * @return
     */
    private boolean matchIndex(char[] s, char[] p, int indexS, int indexP) {
        if (indexP >= p.length) {
            return indexS == s.length;
        }
        // 判断第一个字符匹配结果
        boolean isMatchOfFirstChar = indexS < s.length && (s[indexS] == p[indexP] || p[indexP] == '.');

        if (indexP + 1 < p.length && p[indexP + 1] == '*') {
            return matchIndex(s, p, indexS, indexP + 2) ||
                    (isMatchOfFirstChar && matchIndex(s, p, indexS + 1, indexP));
        }
        return isMatchOfFirstChar && matchIndex(s, p, indexS + 1, indexP + 1);
    }

    /**
     * 解法二：动态规划
     *
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch2(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] p1 = p.toCharArray();

        boolean[][] result = new boolean[s1.length + 1][p1.length + 1];
        result[0][0] = true;
        for (int i = 0; i <= s1.length; i++) {
            for (int j = 1; j <= p1.length; j++) {
                if (p1[j - 1] == '*') {
                    result[i][j] = result[i][j - 2] || (i > 0 && result[i - 1][j] &&
                            (s1[i - 1] == p1[j - 2] || p1[j - 2] == '.'));
                } else {
                    result[i][j] = i > 0 && ((s1[i - 1] == p1[j - 1]) || p1[j - 1] == '.') && result[i - 1][j - 1];
                }
            }
        }
        return result[s1.length][p1.length];
    }

    /**
     * 解法三：使用JDK的正则方法（偷懒解法）
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch3(String s, String p) {
        return s.matches(p);
    }
}
