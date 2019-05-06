package com.happy;

/**
 * 第7题 整数反转
 * 给出一个32位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * @author qgl
 * @date 2019/05/06
 */
public class ReverseInteger7 {
    /**
     * 解法一：将数字转换为字符串后进行反转
     * 时间复杂度：O(n)，空间复杂度：O(n)，其中 n=String.valueOf(x).length()
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        String numberStr = String.valueOf(x);
        if (x < 0) {
            numberStr = numberStr.replace("-", "");
            sb.append("-");
        }
        char[] charArray = numberStr.toCharArray();
        boolean noneZero = true;
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            if (c == 48 && noneZero) {
                noneZero = false;
            }
            if (!noneZero || charArray[charArray.length - 1] != 48) {
                sb.append(c);
            }
        }

        // 溢出判断
        Long result = Long.valueOf(sb.toString());
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.valueOf(sb.toString());
    }

    /**
     * 解法二：弹出、推入数字，并做溢出的检查
     * 时间复杂度：O(log(x))，空间复杂度：O(1)，其中 x指有log⑩(x)位数字
     *
     * @param x
     * @return
     */
    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            boolean isGreater = rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7);
            boolean isSmaller = rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8);
            if (isGreater || isSmaller) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
