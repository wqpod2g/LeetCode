package Solution;

/**
 * Reverse bits of a given 32 bits unsigned integer.

 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
 * @author wangqiang
 *
 */
public class LeetCode190 {
	
	public int reverseBits(int n) {
        int re = 0;
        int bit = 0;
        for(int i=0;i<32;i++) {
            bit = n&1;
            re = re+(bit<<31-i);
            n = n>>1;
        }
        return re;
        
    }

}
