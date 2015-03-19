package Solution;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * @author wangqiang
 *
 */
public class LeetCode136 {
	
	  public int singleNumber(int[] A) {
	        int tmp = 0;
	        int size = A.length;
	        for(int i=0;i<size;i++) {
	            tmp=tmp^A[i];
	        }
	        return tmp;
	  }

}
