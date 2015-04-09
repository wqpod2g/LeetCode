package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 *  Given an input string, reverse the string word by word.
    For example,
    Given s = "the sky is blue",
    return "blue is sky the".
    
    by mrpod2g 2014/9/17
 */

public class ReverseWords {
	
	 public String reverseWords(String s) {
	        String re = "";
	        List<String> words = new ArrayList<String>();
	        String word = "";
	        int flag = 0;
	        for(int i=0;i<s.length();i++) {
	            if(s.charAt(i)!=' ') {
	                word = word+s.charAt(i);
	                flag = 1;
	            }
	            if(flag==1&&(s.charAt(i)==' '||i==s.length()-1)) {
	                words.add(word);
	                word = "";
	                flag = 0;
	            }
	        }
	        for(int j=0;j<words.size();j++) {
	            re = words.get(j)+" "+re;
	        }
	        return re.trim();
	    }

}
