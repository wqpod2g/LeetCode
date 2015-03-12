package Solution;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * @author wangqiang
 *
 */
public class LeetCode16 {
	
	public int threeSumClosest(int[] num, int target) {
        int size = num.length;
        int gap = Integer.MAX_VALUE;
        int re =0;
        for(int i=0;i<size-2;i++) {
            for(int j=i+1;j<size-1;j++) {
                int tmp = num[i]+num[j]; 
                for(int k=j+1;k<size;k++) {
                    int sum = tmp+num[k];
                    int newgap = Math.abs(sum-target);
                    if(newgap==0) return sum;
                    if(newgap<gap) {
                        re = sum;
                        gap = newgap;
                    }
                }
            }
            
        }
        return re;
    }

}
