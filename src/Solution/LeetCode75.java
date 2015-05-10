package Solution;


/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
 * @author wangqiang
 *
 */
public class LeetCode75 {
	
	
	public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int i = 0;
        while(i<=high) {
            if(nums[i]==0) {
                nums[i] = nums[low];
                nums[low++] = 0;
            }
            else if(nums[i]==2) {
                nums[i] = nums[high];
                nums[high--] = 2;
            }
            if(nums[i]==1||low>i) i++;
        }
    }

}
