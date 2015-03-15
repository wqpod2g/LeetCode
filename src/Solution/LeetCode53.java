package Solution;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

   For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
   the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * @author wangqiang
 *
 */
public class LeetCode53 {
	
	public int maxSubArray(int[] A) {
        int size = A.length;
        int max = Integer.MIN_VALUE;
        int tmp = Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            if(tmp<0) {
                tmp = A[i];
            }
            else {
                tmp+=A[i];
            }
            if(tmp>max) {
                max = tmp;
            }
        }
        return max;
    }

}
