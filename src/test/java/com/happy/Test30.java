package com.happy;

import org.junit.Test;

/**
 * 第30题 串联所有单词的子串
 *
 * @author qgl
 * @date 2019/05/30
 */
public class Test30 {
    @Test
    public void test30() {
        FindSubstring30 findSubstring30 = new FindSubstring30();
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println("串联所有单词的子串：" + findSubstring30.findSubstring(s, words));
    }

}
