package com.happy;

/**
 * 第8题 字符串转换成整数
 * 请实现一个函数，能将字符串转换成整数
 *
 * @author qgl
 * @date 2019/05/07
 */
public class StringToInteger8 {
    public int myAutomatic(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }

        str = str.trim();
        int last = 0;
        char firstBit = str.charAt(0);
        if (firstBit != '-' && firstBit != '+' && (firstBit < 48 || firstBit > 57)) {
            return 0;
        }
        int startIndex = (firstBit == '-' || firstBit == '+') ? 1 : 0;

        for (int i = startIndex; i < str.length(); i++) {
            char numberChar = str.charAt(i);
            if (numberChar < 48 || numberChar > 57) {
                break;
            }
            if (numberChar == '0' && last == 0) {
                continue;
            }

            int pop = numberChar - 48;
            if (firstBit == '-') {
                if (-last < Integer.MIN_VALUE / 10 || (-last == Integer.MIN_VALUE / 10 && pop > 8)) {
                    return Integer.MIN_VALUE;
                }
            } else if (last > Integer.MAX_VALUE / 10 || (last == Integer.MAX_VALUE / 10 && pop > 7)) {
                return Integer.MAX_VALUE;
            }

            last = pop + last * 10;
        }

        return firstBit == '-' ? -last : last;
    }
}
