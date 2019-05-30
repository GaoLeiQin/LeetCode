package com.happy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 第30题 串联所有单词的子串
 * 给定一个字符串 s和一些长度相同的单词 words。
 * 找出s中恰好可以由words中所有单词串联形成的子串的起始位置。
 *
 * @author qgl
 * @date 2019/05/30
 */
public class FindSubstring30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        if (s == null || words.length == 0) {
            return result;
        }
        int left, right;
        int len = words[0].length();
        int totalLen = len * words.length;
        int n = s.length();
        String str;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> windowMap = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            left = right = i;
            windowMap.clear();
            while (left <= n - totalLen && right <= n - len) {
                str = s.substring(right, right + len);
                if (!map.containsKey(str)) {
                    left = right + len;
                    right = left;
                    windowMap.clear();
                    continue;
                }
                windowMap.put(str, windowMap.getOrDefault(str, 0) + 1);
                while (windowMap.get(str) > map.get(str)) {
                    String rem = s.substring(left, left + len);
                    windowMap.put(rem, windowMap.get(rem) - 1);
                    left += len;
                }
                right += len;
                if (right - left == totalLen) {
                    result.add(left);
                    String rem = s.substring(left, left + len);
                    windowMap.put(rem, windowMap.get(rem) - 1);
                    left += len;
                }
            }
        }
        return result;
    }
}
