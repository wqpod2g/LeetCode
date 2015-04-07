package Solution;

import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * @author wangqiang
 *
 */
public class LeetCode120 {
	
	 public int minimumTotal(List<List<Integer>> triangle) {
	        int size = triangle.size();
	        for(int i = size-2;i>=0;i--) {
	            for(int j = 0;j<=i;j++) {
	                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
	            }
	        }
	        return triangle.get(0).get(0);
	    }

}
