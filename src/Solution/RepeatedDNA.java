package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatedDNA {
    //将字符转换成对应2位2进制数
    public int toInt(char c) {
        if(c=='A') return 0;
        if(c=='C') return 1;
        if(c=='G') return 2;
        else return 3;
    }
    
    //将hashcode转换成DNA序列
    public String tostring(int n) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<10;i++) {
            char c = 'T';
            int temp = n%4;
            n = n>>2;
            if(temp==0) c = 'A';
            if(temp==1) c = 'C';
            if(temp==2) c = 'G';
            sb.insert(0,c);
        }
        return sb.toString();
    }
    
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> re = new ArrayList<String>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int size = s.length();
        if(size<=10) return re;
        int tmp = 0;
        for(int i=0;i<10;i++) {
            tmp = tmp<<2;
            tmp = tmp|toInt(s.charAt(i));
        }
        map.put(tmp,1);
        for(int j=10;j<size;j++) {
            tmp = ((tmp&0x3ffff)<<2)|toInt(s.charAt(j));//先讲最高2位置0在左移两位
            if(map.containsKey(tmp)) {
                map.put(tmp,map.get(tmp)+1);
            }
            else {
                map.put(tmp,1);
            }
        }
        
        Set<Integer> keys = map.keySet();
        for(Integer key:keys) {
            if(map.get(key)>1) re.add(tostring(key));
        }
        return re;
        
    }

}
