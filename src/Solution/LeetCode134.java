package Solution;

/**
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
 * @author wangqiang
 *
 */
public class LeetCode134 {
	
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        int N = gas.length;
	        int j = 0;
	        for(int i=0;i<N;i=j+1) {
	            int sum = 0;
	            for(j=i;j<N+i;j++) {
	                sum = sum+gas[j%N];
	                if(sum<cost[j%N]) break;
	                else sum = sum-cost[j%N];
	                if(j==N+i-1) return i;
	            }
	        }
	        return -1;
	    }

}
