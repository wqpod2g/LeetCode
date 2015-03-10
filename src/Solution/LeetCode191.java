package Solution;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 * @author wangqiang
 *
 */
public class LeetCode191 {
	
	public class Solution {
	    // you need to treat n as an unsigned value
	    public int hammingWeight(int n) {
	        int re = 0;
	        int bit = 0;
	        for(int i=0;i<32;i++) {
	            bit = n&1;
	            if(bit==1) re++;
	            n>>=1;
	        }
	        return re;
	    }
	}

}
