package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, return true if and only if there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 * @author wangqiang
 *
 */
public class LeetCode219 {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])&&(i-map.get(nums[i]))<=k) return true;
            else map.put(nums[i],i);
        }
        return false;
    }

}
