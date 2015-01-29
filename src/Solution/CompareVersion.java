package Solution;

public class CompareVersion {
	
 public static int compareVersion(String version1, String version2) {
        
        if(version1.equals(version2)){
            return 0;
        }
        
        int first1,first2;
        String second1,second2;
        if(version1.contains(".")){
            String[] str=version1.split(".");
            if(str[0].length()==0){
                first1=0;
            }
            else{
                 first1=Integer.parseInt(str[0]);
            }
            second1=str[1];
        }
        else{
            first1=Integer.parseInt(version1);
            second1="0";
        }
        
        if(version2.contains(".")){
            String[] str=version2.split(".");
            if(str[0].length()==0){
                first2=0;
            }
            else{
                 first2=Integer.parseInt(str[0]);
            }
            second2=str[1];
        }
        else{
            first2=Integer.parseInt(version2);
            second2="0";
        }
        
        
        if(first1>first2){
            return 1;
        }
        else if(first1<first2){
            return -1;
        }
        
        else return compareVersion(second1,second2);
    }



 
 
 public static void main(String[] args){
	 System.out.println(compareVersion("1.0","1.1"));
 }
	
	
	
	
	




}
