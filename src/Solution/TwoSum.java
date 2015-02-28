package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 * You may assume that each input would have exactly one solution.

 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * @author mrpod2g
 *
 */
public class TwoSum {
	
	 public int[] twoSum(int[] numbers, int target) {
         int[] re = new int[2];
         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
         int size = numbers.length;
         for(int i=0;i<size;i++) {
             int tmp = target-numbers[i];
             if(!map.containsKey(tmp)) {
                map.put(numbers[i],i);
             }
             else {
                 int index = map.get(tmp);
                 re[0] = (i<index?i:index)+1;
                 re[1] = (i>index?i:index)+1;
             }
         }
         return re;
    }

}
