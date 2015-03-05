package Solution;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 *  For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * @author wangqiang
 *
 */
public class LargestNumber {
	
	public class Solution {
	    
	    //判断a，b的位置，a在b之前返回true否则返回false
	    public boolean compare(int a,int b) {
	        String s1 = String.valueOf(a);
	        String s2 = String.valueOf(b);
	        String sum1 = s1+s2;
	        String sum2 = s2+s1;
	        if(sum1.compareTo(sum2)>=0) return true;
	        else return false;
	    }
	    
	    public String largestNumber(int[] num) {
	        String re = "";
	        int size = num.length;
	        //冒泡排序，每次将最小的沉底
	        for(int i=0;i<size-1;i++) {
	            for(int j=0;j<size-i-1;j++) {
	                if(!compare(num[j],num[j+1])) {
	                    int tmp = num[j];
	                    num[j] = num[j+1];
	                    num[j+1] = tmp;
	                }
	            }
	        }
	        int sum = 0;
	        for(int k=0;k<size;k++) {
	            sum+=num[k];
	            re = re+num[k];
	        }
	        if(sum==0){
	            re = "0";
	        }
	        return re;
	    }
	}

}
