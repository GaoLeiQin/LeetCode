package com.happy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 第139题 单词拆分
 *
 * @author qgl
 * @date 2019/07/11
 */
public class Test139 {
    @Test
    public void test139() {
        WordBreak139 wordBreak139 = new WordBreak139();
        String str = "leetcode";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");

        System.out.println("单词是否可以拆分：" + wordBreak139.wordBreak(str, list));
    }
}
