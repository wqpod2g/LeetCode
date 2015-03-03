package Solution;

public class LeetCode5 {
	
	 public static boolean isPalindrome(String str) {
	        int size = str.length();
	        for(int i=0;i<=(size-1)/2;i++) {
	            if(str.charAt(i)!=str.charAt(size-1-i)) return false;
	        }
	        return true;
	    }
	    
	    public static String longestPalindrome(String s) {
	        int size = s.length();
	        int longest = 0;
	        String re = "";
	        for(int i=0;i<size;i++) {
	            for(int j=i+1;j<size;j++) {
	                int length = j-i+1;
	                String substring = s.substring(i,j+1);
	                if(isPalindrome(substring)&&length>longest) {
	                    re = substring;
	                    longest = length;
	                }
	            }
	        }
	        return re;
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(longestPalindrome("nmngaowrbsssvihklwmuqshcddwlxrywrlwtennwfvrevgvhsvgeccfulmuvrcksdmgeqrblnlwoepefhcwhmgyvgcoyyygrmttyfycxwbqktpurlcfhzlakhmrddsydgygganpmaglaxyhfwjusukzcnakznygqplngnkhcowavxoiwrfycxwdkxqfcjqwyqutcpyedbnuogedwobsktgioqdczxhikjrbkmqspnxcpngfdwdaboscqbkwforihzqdcppxjksiujfvlpdjryewaxgmdgigvxdlstxwngtbdrrkfudjinzyxbdmkautclvvyguekuzwwetmsxittgtxbnvvrgasvnlogdiepltweaehubwelznidltzlbzdsrxmhjpkmylnwkdsxnpkplkdzywioluaqguowtbaoqzqgjfewphqcvlnwlojbxgomvxxkhwwykawegxubjiobizicuxzeafgautefsurgjlbhcfevqzsbhwxycrcaibdsgluczcuewzqupakbzmcvzsfodbmgtugnihyhqkvyeboqhqldifbxuaxqzxtyejoswikbzpsvzkxcndgeyvfnyrfbkhlalzpqjueibnodamgpnxlkvwvliouvejcpnakllfxepldfmdzszagkyhdgqqbkb"));
	    }

}
