package Solution;

public class LeetCode204 {
	
	 public static int countPrimes(int n) {
	        boolean[] A = new boolean[n+1];
	        for(int i=2;i*i<n;i++) {
	            if(!A[i]) {
	                int j = 0;
	                while(i*i+j<=n) {
	                    A[i*i+j] = true;
	                    j = j+i;
	                }
	            }
	        }
	        int count = 0;
	        for(int j=2;j<n;j++) {
	            if(!A[j])
	            count++;
	        }
	        return count;
	    }
	 
	 public static void main(String[] args) {
		 double start = System.currentTimeMillis();
		 System.out.println(countPrimes(1000000000));
		 double end = System.currentTimeMillis();
		 System.out.println((end-start)/1000+"s");
	 }

}
