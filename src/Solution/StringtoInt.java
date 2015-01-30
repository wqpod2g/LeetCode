package Solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implement atoi to convert a string to an integer.
 * @author wangqiang
 * @since 2015-1-30
 */
public class StringtoInt {
	
public int atoi(String str) {
        
        //排除空串或者str不含数字的情况
        if(str.length() == 0||str.replaceAll("\\D","").length() == 0){
            return 0;
        }
        
        //排除第一个非空字符不是+-或者数字的情况
        String temp = str.replace(" ","");
        if(temp.charAt(0)!='+'&&temp.charAt(0)!='-'&&(temp.charAt(0)>'9'||temp.charAt(0)<'0')){
            return 0;
        }
        
        //排除+-后面一个字符不是数字的情况
        int index;
        if(temp.charAt(0) == '-'){
            index = str.indexOf('-');
            if(str.charAt(index+1)>'9'||str.charAt(index+1)<'0'){
                return 0;
            }
        }
        
        if(temp.charAt(0) == '+'){
            index = str.indexOf('+');
            if(str.charAt(index+1)>'9'||str.charAt(index+1)<'0'){
                return 0;
            }
        }
        
        //排除所有特殊情况后用正则表达式匹配
        String re = "";
        Pattern p = Pattern.compile("[+-]?\\d+");
        Matcher m = p.matcher(str);
        if(m.find()){
            re = m.group();
        }
        else{
            return 0;
        }
        //若所得数字大于MAX_VALUE则返回MAX_VALUE
        if(Double.valueOf(re)>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        //若所得数字小于MIN_VALUE则返回MIN_VALUE
        if(Double.valueOf(re)<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        return Integer.valueOf(re);
    }

}
