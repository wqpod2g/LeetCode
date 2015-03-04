package Solution;

/**
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 * @author wangqiang
 *
 */
public class LeetCode5 {
	
	public static String subPalindrome(String s,int i,int j) {
        while(i>=0&&j<=s.length()-1&&s.charAt(i)==s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
    
    public static String longestPalindrome(String s) {
        int size = s.length();
        String re = "";
        for(int i=0;i<size;i++) {
            String substring = subPalindrome(s,i,i+1);
            if(substring.length()>re.length()) re = substring;
            substring = subPalindrome(s,i-1,i+1);
            if(substring.length()>re.length()) re = substring;
        }
        
        return re;
    }
	    
	    public static void main(String[] args) {
	    	System.out.println(longestPalindrome("nmngaowrbsssvihklwmuqshcddwlxrywrlwtennwfvrevgvhsvgeccfulmuvrcksdmgeqrblnlwoepefhcwhmgyvgcoyyygrmttyfycxwbqktpurlcfhzlakhmrddsydgygganpmaglaxyhfwjusukzcnakznygqplngnkhcowavxoiwrfycxwdkxqfcjqwyqutcpyedbnuogedwobsktgioqdczxhikjrbkmqspnxcpngfdwdaboscqbkwforihzqdcppxjksiujfvlpdjryewaxgmdgigvxdlstxwngtbdrrkfudjinzyxbdmkautclvvyguekuzwwetmsxittgtxbnvvrgasvnlogdiepltweaehubwelznidltzlbzdsrxmhjpkmylnwkdsxnpkplkdzywioluaqguowtbaoqzqgjfewphqcvlnwlojbxgomvxxkhwwykawegxubjiobizicuxzeafgautefsurgjlbhcfevqzsbhwxycrcaibdsgluczcuewzqupakbzmcvzsfodbmgtugnihyhqkvyeboqhqldifbxuaxqzxtyejoswikbzpsvzkxcndgeyvfnyrfbkhlalzpqjueibnodamgpnxlkvwvliouvejcpnakllfxepldfmdzszagkyhdgqqbkb"));
	    }

}
