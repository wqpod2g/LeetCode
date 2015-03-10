package Solution;

/**
 *  Say you have an array for which the ith element is the price of a given stock on day i.

 *  Design an algorithm to find the maximum profit. 
   
 *  You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
   
 *  However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * @author wangqiang
 *
 */
public class LeetCode122 {

	public class Solution {
	    public int maxProfit(int[] prices) {
	        int size = prices.length;
	        int profit = 0;
	        for(int i=0;i<size-1;i++) {
	            if(prices[i+1]>prices[i]) {
	                profit = profit+prices[i+1]-prices[i];
	            }
	        }
	        return profit;
	    }
	}
}