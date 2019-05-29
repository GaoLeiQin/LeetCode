package com.happy;

/**
 * 第29题 两数相除
 * 给定两个整数，被除数 dividend和除数divisor。将两数相除，要求不使用乘法、除法和 mod运算符。
 *
 * @author qgl
 * @date 2019/05/29
 */
public class DivideTwoIntegers29 {
    /**
     * 解法一：使用位运算，找到一个足够大的数
     *
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dividendTmp = Math.abs((long) dividend);
        long divisorTmp = Math.abs((long) divisor);
        int result = 0;
        // 因为数值范围是[−2^31,  2^31 − 1]，所以n <= 31;
        for (int n = 31; n >= 0; n--) {
            if ((dividendTmp >> n) >= divisorTmp) {
                // 将结果加上2^n
                result += 1 << n;
                // 将被除数减去 divisor*2^n
                dividendTmp -= divisorTmp << n;
            }
        }
        return (dividend ^ divisor) < 0 ? -result : result;
    }

    /**
     * 解法二：二分查找
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide2(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // divCount 是当前divisorTmp相对于divisor的倍数
        int divCount = 1;
        int result = 0;
        long dividendTmp = Math.abs((long) dividend);
        long divisorTmp = Math.abs((long) divisor);

        while (dividendTmp >= divisorTmp) {
            dividendTmp -= divisorTmp;
            result += divCount;

            if (dividendTmp < Math.abs(divisor)) {
                break;
            }
            // divisorTmp无法倍增时，就将其初始化为divisor绝对值，重新开始下一轮倍增
            if (dividendTmp - divisorTmp < divisorTmp) {
                divisorTmp = Math.abs(divisor);
                divCount = 1;
                continue;
            }
            divisorTmp += divisorTmp;
            divCount += divCount;
        }
        return (dividend ^ divisor) < 0 ? -result : result;
    }
}
