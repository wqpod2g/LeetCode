package Solution;

/**
 * Rotate an array of n elements to the right by k steps.
 *  For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * @author mrpod2g
 *
 */
public class RotateArray {
	
	public void rotate(int[] nums, int k) {
        int size = nums.length;
        int tmp = nums[size-1];
        for(int i=0;i<k;i++) {
            for(int j=size-2;j>=0;j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = tmp;
            tmp = nums[size-1];
        }
    }

}
