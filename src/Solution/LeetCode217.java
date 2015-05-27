package Solution;

import java.util.Arrays;
import java.util.HashSet;


/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * @author mrpod2g
 *
 */
public class LeetCode217 {
	
	 public boolean containsDuplicate(int[] nums) {
	        if(nums.length<=1) return false;
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++) {
	            if(nums[i]==nums[i+1]) return true;
	        }
	        return false;
	    }
	 
	 public boolean containsDuplicate2(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++) {
	            if(set.contains(nums[i])) return true;
	            else set.add(nums[i]);
	        }
	        return false;
	    }

}
