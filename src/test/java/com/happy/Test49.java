package com.happy;

import org.junit.Test;

/**
 * 第49题 字母异位词分组
 *
 * @author qgl
 * @date 2019/06/10
 */
public class Test49 {
    @Test
    public void test49() {
        GroupAnagrams49 groupAnagrams49 = new GroupAnagrams49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("字母异位词分组：" + groupAnagrams49.groupAnagrams(strs));
    }

}
