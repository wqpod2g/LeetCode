package Solution;

import java.util.Set;

/**
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
 * @author mrpod2g
 *
 */
public class LeetCode139 {
	
	  public boolean wordBreak(String s, Set<String> dict) {
	        int size = s.length();
	        boolean[] breakable = new boolean[size+1];
	        breakable[0] = true;
	        for(int i=1;i<=size;i++) {
	            for(int j=0;j<i;j++) {
	                if(breakable[j]&&dict.contains(s.substring(j,i))) {
	                    breakable[i] = true;
	                    break;
	                }
	            }
	        }
	        return breakable[size];
	    }

}
