package Solution;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

   For example, given the array [2,3,-2,4],
   the contiguous subarray [2,3] has the largest product = 6.
 * @author wangqiang
 *
 */
public class LeetCode152 {
	
	public int Min(int a,int b) {
        return a<b?a:b;
    }
    
    public int Max(int a,int b) {
        return a>b?a:b;
    }
    
    public int maxProduct(int[] A) {
        int size = A.length;
        int local_max = A[0];//局部最大
        int local_min = A[0];//局部最小
        int global = A[0];//全局最大
        for(int i=1;i<size;i++) {
            int tmp = local_max;
            local_max = Max(Max(local_max*A[i],A[i]),local_min*A[i]);
            local_min = Min(Min(tmp*A[i],A[i]),local_min*A[i]);
            global = Max(global,local_max);
        }
        return global;
    }

}
