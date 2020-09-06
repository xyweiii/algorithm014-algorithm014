package com.sioo.discover.api.week_04;

/**
 *
 * 122. 买卖股票的最佳时机 II
 *
 * @author : xywei
 * @date : 2020-09-06
 */
public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
