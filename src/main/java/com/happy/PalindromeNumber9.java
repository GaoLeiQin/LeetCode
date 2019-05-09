package com.happy;

/**
 * 第9题 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author qgl
 * @date 2019/05/08
 */
public class PalindromeNumber9 {
    /**
     * 解法一：利用StringBuilder的反转函数
     * 时间复杂度：O(n)，空间复杂度：O(n)
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        return String.valueOf(x).equals(sb.reverse().toString());
    }

    /**
     * 解法二：比较一半的回文数
     * 时间复杂度：O(log(x))，空间复杂度：O(1)，其中 x指有log⑩(x)位数字
     *
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
