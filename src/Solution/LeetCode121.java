package Solution;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

 *  If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * @author mrpod2g
 *
 */
public class LeetCode121 {
	
	public class Solution {
	    public int maxProfit(int[] prices) {
	        int max = 0;
	        int min = Integer.MAX_VALUE;
	        int size = prices.length;
	        for(int i=0;i<size;i++) {
	            int tmp = prices[i]-min;
	            max = tmp>max?tmp:max;
	            if(prices[i]<min) min = prices[i];
	        }
	        return max;
	    }
	}

}
