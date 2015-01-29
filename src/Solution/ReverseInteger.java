package Solution;

/**
 * Reverse digits of an integer.
 *  Example1: x = 123, return 321
 *  Example2: x = -123, return -321
 *  
 * @author wangqiang
 * 
 * @since 2015-1-18
 *
 */
public class ReverseInteger {
	public int reverse(int x) {
        String s = x+"";
        char[] char_array = s.toCharArray();
        int size = char_array.length;
        String re = "";
        for(int i=0;i<size;i++){
            re=re+char_array[size-i-1];
        }
        
        if(x<0){
            re="-"+re.replace("-","");
        }
        
        if(Double.valueOf(re)>Math.pow(2,31)-1||Double.valueOf(re)<-Math.pow(2,31)){
            return 0;
        }
        
        return Integer.valueOf(re);
        
    }

}
