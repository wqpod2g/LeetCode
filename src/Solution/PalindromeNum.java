package Solution;
 /**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author wangqiang
 *
 */
public class PalindromeNum {
	
	public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int e = 1;
        while(x/e>=10){
            e = e*10;
        }
        int highDigit,lowDigit;
        while(x!=0){
            highDigit = x/e;
            lowDigit = x%10;
            if(highDigit!=lowDigit){
                return false; 
            }
            x = x-highDigit*e;
            x = x/10;
            e = e/100;
        }
        return true;
    }

}

