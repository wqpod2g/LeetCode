package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 * @author wangqiang
 *
 */
public class LeetCode78 {
	
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        re.add(new ArrayList<Integer>());//初始化，加入空集
        Arrays.sort(nums);
        for(int i:nums) {
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for(List<Integer> set:re) {
                List<Integer> tmp_set = new ArrayList<Integer>();
                tmp_set.addAll(set);//clone原来存在的list
                tmp_set.add(i);
                tmp.add(tmp_set);
            }
            re.addAll(tmp);
        }
        return re;
    }

}
