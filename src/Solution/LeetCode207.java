package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode207 {
	
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
	        
	        int[] degree = new int[numCourses];//每个定点的入度
	        Stack<Integer> stack = new  Stack<Integer>();//存放入度为0的顶点
	        @SuppressWarnings("unchecked")
			List<Integer>[] adjList = new ArrayList[numCourses];//邻接表
	        for(int q=0;q<numCourses;q++) adjList[q] = new ArrayList<Integer>();
	        
	        //初始化邻接表
	        for(int p=0;p<prerequisites.length;p++) {
	           adjList[prerequisites[p][1]].add(prerequisites[p][0]);
	        }
	        
	        //初始化每个顶点入度
	        for(int i=0;i<numCourses;i++) {
	            for(Integer vertex:adjList[i])
	            degree[vertex]++;
	        }
	        //将入度为0的顶点入栈
	        for(int j=0;j<numCourses;j++) {
	            if(degree[j]==0) stack.push(j);
	        }
	        
	        int count = 0;//当前拓扑排序顶点个数
	        while(!stack.empty()) {
	            count++;
	            int v = stack.pop();
	            for(Integer i:adjList[v]) {
	                if(--degree[i]==0) stack.push(i);
	            }
	        }
	        if(count!=numCourses) return false;
	        else return true;
	    }

}
