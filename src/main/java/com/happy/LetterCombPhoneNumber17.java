package com.happy;

import java.util.ArrayList;
import java.util.List;

/**
 * 第17题 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射与电话按键相同。注意 1不对应任何字母。
 *
 * @author qgl
 * @date 2019/05/17
 */
public class LetterCombPhoneNumber17 {
    /**
     * 获取字符串所能表示的字母组合
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        List<String> combineList = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combineList;
        }
        combinationRecursive(combineList, "", digits);
        return combineList;
    }

    /**
     * 递归查找所有的字母组合
     * @param combineList
     * @param cur
     * @param digits
     */
    public void combinationRecursive(List<String> combineList, String cur, String digits) {
        if (cur.length() == digits.length()) {
            combineList.add(cur);
            return;
        }

        int index = digits.charAt(cur.length()) - '0';
        String str = this.getStringByNumber(index);
        for (int i = 0; i < str.length(); i++) {
            combinationRecursive(combineList, cur + str.charAt(i), digits);
        }
    }

    /**
     * 获取数字对应的字符串
     * @param number
     * @return
     */
    private String getStringByNumber(int number) {
        String str = null;
        switch (number) {
            case 2:
                str = "abc";
                break;
            case 3:
                str = "def";
                break;
            case 4:
                str = "ghi";
                break;
            case 5:
                str = "jkl";
                break;
            case 6:
                str = "mno";
                break;
            case 7:
                str = "pqrs";
                break;
            case 8:
                str = "tuv";
                break;
            case 9:
                str = "wxyz";
                break;
            default:
                str = "";
        }
        return str;
    }
}
