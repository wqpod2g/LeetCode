package Solution;

/**
 *  Given an input string, reverse the string word by word.
    For example,
    Given s = "the sky is blue",
    return "blue is sky the".
    
    by mrpod2g 2014/9/17
 */

public class ReverseWords {
    public static String reverseWords(String s) {
    	String[] str=s.split(" ");
    	s="";
    	for(int i=str.length-1;i>0;i-- ){
    		s=s+str[i]+" ";
    	}
    	s=s+str[0];
    	return s;
        
    }
	public static void main(String args[]){
		String s="    ";
		//s=reverseWords(s);
		System.out.print(s.length());
		
	}

}
