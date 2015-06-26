package Solution;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {
	
	 public List<String> summaryRanges(int[] nums) {
	        List<String> list = new ArrayList<String>();
	        int start = 0;//头
	        int end = 0;//尾
	        if(nums.length==0) return list;
	        for(int i=0;i<nums.length-1;i++) {
	            if(nums[i+1]-nums[i]==1) {
	                end++;
	            }
	            else {
	                if(start==end) list.add(nums[start]+"");
	                else list.add(nums[start]+"->"+nums[end]);
	                start = i+1;
	                end = i+1;
	            }
	        }
	        if(start==end) list.add(nums[start]+"");
	        else list.add(nums[start]+"->"+nums[end]);
	        return list;
	    }

}
