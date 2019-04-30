package com.happy;

/**
 * 第5题 最长回文子串
 * 给定一个字符串s，找到s中最长的回文子串(s.length() <= 1000)
 *
 * @author qgl
 * @date 2019/04/29
 */
public class LongestPalindrome5 {

    /**
     * 解法一：暴力法
     * 时间复杂度：O(n³)，空间复杂度：O(1)
     *
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        int strLength = s.length();
        String reverseString = new StringBuffer(s).reverse().toString();
        String longestPalindromeStr = "";
        int maxLength = 0;
        int start, end;
        for (int i = 0; i < strLength; i++) {
            start = i;
            for (end = strLength; ; end--) {
                if (start >= end) {
                    break;
                }
                String subStr = s.substring(start, end);
                int temp = end - start;
                if (temp > maxLength && reverseString.contains(subStr)) {
                    longestPalindromeStr = subStr;
                    maxLength = temp;
                }
            }
        }
        return longestPalindromeStr;
    }

    /**
     * 解法二：中心扩展法
     * 时间复杂度：O(n²)，空间复杂度：O(1)
     *
     * @param s
     * @return
     */
    public String longestPalindrome2(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = findCenterPosition(s, i, i);
            int len2 = findCenterPosition(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * 寻找中间点
     * @param s
     * @param leftIndex
     * @param rightIndex
     * @return
     */
    private int findCenterPosition(String s, int leftIndex, int rightIndex) {
        int left = leftIndex, right = rightIndex;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
