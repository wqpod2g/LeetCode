package Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Given an array of integers, every element appears three times except for one. Find that single one.
 * @author mrpod2g
 *
 */
public class LeetCode137 {
	
    public int singleNumber(int[] A) {
        int size = A.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++) {
            if(map.containsKey(A[i])) {
                int tmp = map.get(A[i]);
                map.put(A[i],tmp+1);
            }
            else {
                map.put(A[i],1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(Integer key:keys) {
            if(map.get(key)==1) return key;
        }
        return 0;
    }

}
