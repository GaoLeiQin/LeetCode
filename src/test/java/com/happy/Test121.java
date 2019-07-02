package com.happy;

import org.junit.Test;

/**
 * 第121题 买卖股票的最佳时机
 *
 * @author qgl
 * @date 2019/07/02
 */
public class Test121 {
    @Test
    public void test121() {
        BuySellStock121 buySellStock121 = new BuySellStock121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("获取的最大利润：" + buySellStock121.maxProfit(prices));
    }
}
