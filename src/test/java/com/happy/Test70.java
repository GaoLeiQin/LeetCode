package com.happy;

import org.junit.Test;

/**
 * 第70题 爬楼梯
 *
 * @author qgl
 * @date 2019/06/17
 */
public class Test70 {
    @Test
    public void test70() {
        ClimbingStairs70 climbingStairs70 = new ClimbingStairs70();
        int n = 5;
        System.out.println("解法一，一共有多少种方法：" + climbingStairs70.climbStairs(n));
        System.out.println("解法二，一共有多少种方法：" + climbingStairs70.climbStairs2(n));
    }

}
