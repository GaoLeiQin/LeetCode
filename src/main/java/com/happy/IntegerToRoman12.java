package com.happy;

/**
 * 第12题 整数转罗马数字
 * 给定一个整数，将其转为罗马数字。输入确保在1到3999的范围内。
 *
 * @author qgl
 * @date 2019/05/12
 */
public class IntegerToRoman12 {
    /**
     * 将整数转换为罗马数字（整合）
     *
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] reps = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(reps[i]);
            }
        }
        return result.toString();
    }
}
