package com.happy;

/**
 * 第13题 罗马数字转整数
 * 给定一个罗马数字，将其转换成整数。输入确保在1到3999的范围内。
 *
 * @author qgl
 * @date 2019/05/13
 */
public class RomanToInteger13 {
    /**
     * 将罗马数字转换为整数
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return this.getNumber(chars[0]);
        }

        int result = 0;
        for (int i = 0; i < chars.length - 1; ++i) {
            int number = this.getNumber(chars[i]);
            if (number < this.getNumber(chars[i + 1])) {
                result -= number;
            } else {
                result += number;
            }
        }

        result += this.getNumber(chars[chars.length - 1]);
        return result;
    }

    /**
     * 获取罗马字符对应的整数
     *
     * @param c
     * @return
     */
    private int getNumber(char c) {
        int number = 0;
        switch (c) {
            case 'I': {
                number = 1;
                break;
            }
            case 'V': {
                number = 5;
                break;
            }
            case 'X': {
                number = 10;
                break;
            }
            case 'L': {
                number = 50;
                break;
            }
            case 'C': {
                number = 100;
                break;
            }
            case 'D': {
                number = 500;
                break;
            }
            case 'M': {
                number = 1000;
                break;
            }
            default:
                number = 0;
        }
        return number;
    }
}
