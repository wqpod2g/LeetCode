package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 * @author wangqiang
 *
 */
public class LeetCode205 {
	
	 /**
     * 将字符串转换成abc的形式如egg->abb,paper->abacd
     */
    public String transform(String s) {
        StringBuffer re = new StringBuffer("");
        char tmp = 'a';
        Map<Character,Character> map = new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),tmp);
                re.append(tmp);
                tmp++;
            }
            else {
                re.append(map.get(s.charAt(i)));
            }
        }
        return re.toString();
    }
    
    public boolean isIsomorphic(String s, String t) {
        if(transform(s).equals(transform(t))) return true;
        else return false;
    }

}
