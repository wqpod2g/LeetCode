package Solution;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 * @author wangqiang
 *
 */
public class LeetCode96 {
	
	 public int numTrees(int n) {
	        int[] A = new int[n+1];
	        A[0] = 1;
	        for(int i=1;i<=n;i++) {
	            for(int j=1;j<=i;j++) {
	                A[i] = A[i]+A[j-1]*A[i-j];
	            }
	        }
	        return A[n];
	    }

}
