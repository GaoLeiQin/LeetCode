package com.happy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 第3题 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 *
 * @author qgl
 * @date 2019/04/27
 */
public class LongestSubstring3 {
    /**
     * 解法一：获取无重复字符的最长子串的长度（使用滑动窗口）
     * 时间复杂度：O(2n)，空间复杂度：O(min(m, n))
     * m = 子串长度，n = 字符串长度
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int length = 0;
        int i = 0;
        int j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                length = Math.max(length, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return length;
    }

    /**
     * 解法二：获取无重复字符的最长子串的长度（优化后的滑动窗口）
     * 时间复杂度：O(n)，空间复杂度：O(min(m, n))
     * m = 子串长度，n = 字符串长度
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            length = Math.max(length, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return length;
    }
}
