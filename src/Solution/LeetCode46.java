package Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * @author wangqiang
 *
 */
public class LeetCode46 {
	
	public List<List<Integer>> permute(int[] nums) {
        int size = nums.length;
        List<List<Integer>> pre = new ArrayList<List<Integer>>();
        pre.add(new LinkedList<Integer>());
        for(int i=0;i<size;i++) {
            List<List<Integer>> cur = new ArrayList<List<Integer>>();
            for(List<Integer>list :pre) {
                for(int j=0;j<=list.size();j++) {
                    List<Integer> newlist = new LinkedList<Integer>();
                    newlist.addAll(list);
                    newlist.add(j,nums[i]);
                    cur.add(newlist);
                }
            }
            pre.clear();
            pre.addAll(cur);
        }
        return pre;
    }

}
