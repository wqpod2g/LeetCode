package Solution;

import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
	
	 private Set<Integer> num_set = new HashSet<Integer>();
	    
	    public int getSum(int n) {
	        int sum = 0;
	        while(n!=0) {
	            sum = sum+(n%10)*(n%10);
	            n = n/10;
	        }
	        return sum;
	    }
	    
	    public boolean isHappy(int n) {
	        if(num_set.contains(n)) return false;
	        else num_set.add(n);
	        int sum = getSum(n);
	        if(sum==1) return true;
	        else return isHappy(sum);
	    }

}
