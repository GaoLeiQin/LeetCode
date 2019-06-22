package com.happy;

import org.junit.Test;

/**
 * 第79题 单词搜索
 *
 * @author qgl
 * @date 2019/06/22
 */
public class Test79 {
    @Test
    public void test79() {
        WordSearch79 wordSearch79 = new WordSearch79();
//        char[][] chars = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        char[][] chars = {{'a','a'}};
        String word = "aaa";
        System.out.println("单词是否存在于网格中：" + wordSearch79.exist(chars, word));
    }

}
