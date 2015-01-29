package Solution;

import java.util.ArrayList;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

   P   A   H   N
   A P L S I I G
   Y   I   R
   And then read line by line: "PAHNAPLSIIGYIR"

 

   Write the code that will take a string and make this conversion given a number of rows:

   string convert(string text, int nRows);
   convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
   
 * @author wangqiang
 * @since 2015-1-28
 *
 */
public class ZigZagConversion {
	
	 public String convert(String s, int nRows) {
	        ArrayList<ArrayList<String>> allList = new ArrayList<ArrayList<String>>();//用于存放ZigZag后的二维字符数组
	        char[] char_array = s.toCharArray();
	        int size = char_array.length;//字符总长度
	        
	        if(size<=nRows||nRows==1){
	            return s;
	        }
	        
	        for(int i=0;i<nRows;i++){//初始化allList
	            ArrayList<String> list = new ArrayList<String>();
	            allList.add(list);
	        }
	        int y = 0;//二维坐标（初始点为(0,0)）
	        int stepY = 1;//2个坐标上的增量
	        int value = 2*nRows-2;
	        for(int n=0;n<size;n++){
	            String letter = String.valueOf(char_array[n]);
	            allList.get(y).add(letter);
	            
	            if(n%value == 0){
	                stepY = 1;
	            }
	            else if(n%value == nRows-1){
	                stepY = -1;
	            }
	            y = y+stepY;//跟新坐标
	        }
	        String result = "";
	        
	         for(int j=0;j<nRows;j++){
	             ArrayList<String> lists = allList.get(j);
	             for(String list:lists){
	                 result = result+list;
	             }
	        }
	        return result;
	        
	    }

}
