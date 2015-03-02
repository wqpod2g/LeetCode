package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mrpod2g
 *
 */
public class LeetCode3 {
	
	public int lengthOfLongestSubstring(String s) {
        int start = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int max_length = 0;
        int size = s.length();//字符串长度
        for(int i=0;i<size;i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                int sub_length = i-start;
                max_length = sub_length>max_length?sub_length:max_length;
                int index = map.get(s.charAt(i));//之前出现过c的位置
                //将start到index所有字符从map中删除
                for(int j=start;j<=index;j++) {
                    map.remove(s.charAt(j));
                }
                map.put(c,i);
                start = index+1;//更新start
            }
            else {
                map.put(c,i);
                if(i==size-1) max_length = map.size()>max_length?map.size():max_length;
            }
        }
        return max_length;
    }
	 
	 

}
