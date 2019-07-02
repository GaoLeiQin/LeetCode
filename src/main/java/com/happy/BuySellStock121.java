package com.happy;

/**
 * 第121题 买卖股票的最佳时机
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 *
 * @author qgl
 * @date 2019/07/02
 */
public class BuySellStock121 {
    /**
     * 获取最大利润
     * 时间复杂度：O(n)，空间复杂度：O(1)
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrices = Math.min(prices[i], minPrices);
            maxProfit = Math.max(prices[i] - minPrices, maxProfit);
        }
        return maxProfit;
    }
}
