package Solution;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 * @author wangqiang
 *
 */
public class LeetCode91 {
	
	public int numDecodings(String s) {
        if(s.length()==0||s.contains("00")||(s.length()>0&&s.charAt(0)=='0')) return 0;
        int[] num = new int[s.length()+1];
        num[0] = 1;
        num[1] = 1;
        for(int i=1;i<s.length();i++) {
            int tmp = Integer.valueOf(s.substring(i-1,i+1));
            if(s.charAt(i)=='0') {
                if(tmp>=30) return 0;
                else {
                    num[i] = num[i-1];
                    num[i+1] = num[i];
                }
            }
            else {
                if(tmp>26||tmp<10) num[i+1] = num[i];
                else num[i+1] = num[i]+num[i-1];
            }
        }
        return num[s.length()];
    }

}
