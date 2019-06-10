package com.happy;

import java.util.*;

/**
 * 第49题 字母异位词分组
 * 定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * @author qgl
 * @date 2019/06/10
 */
public class GroupAnagrams49 {
    /**
     * 按字符排序数组分类
     * 时间复杂度：O(nk log k)，空间复杂度：O(nk)
     * 其中 n 是 strs的长度，而 k 是 strs中字符串的最大长度。
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
