package com.happy;

import org.junit.Test;

/**
 * 第17题 电话号码的字母组合
 *
 * @author qgl
 * @date 2019/05/17
 */
public class Test17 {
    @Test
    public void test17() {
        LetterCombPhoneNumber17 letterCombPhoneNumber17 = new LetterCombPhoneNumber17();
        String digits = "23";
        System.out.println("电话号码的字母组合 " + letterCombPhoneNumber17.letterCombinations(digits));
    }

}
