package Solution;

import java.util.ArrayList;

/**
 *  Given an input string, reverse the string word by word.
    For example,
    Given s = "the sky is blue",
    return "blue is sky the".
    
    by mrpod2g 2014/9/17
 */

public class ReverseWords {
    public static String reverseWords(String s) {
    	char[] str=s.toCharArray();
    	ArrayList<String>list=new ArrayList<String>();
    	String temp="";
    	for(int i=0;i<str.length;i++){
    		if(str[i]!=' '){
    			temp=temp+str[i];
    		}
    		else{
    			if(!temp.isEmpty()){
    				list.add(temp);
    				temp="";
    			}
    		}
    	}
    	if(!temp.isEmpty()){
    		list.add(temp);
    	}
    	
    	s="";
    	if(list.size()>1){
    		for(int j=list.size()-1;j>0;j--){
        		s=s+list.get(j)+" ";
        	}
        	s=s+list.get(0);
    	}
    		
    	if(list.size()==1){
    		s=list.get(0);
    	}
    	return s;
    }
	public static void main(String args[]){
		String s="he     llo    wo";
		s=reverseWords(s);
		System.out.print(s);
		
	}

}
