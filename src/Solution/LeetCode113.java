package Solution;

import java.util.ArrayList;
import java.util.List;


/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
 * @author mrpod2g
 *
 */
public class LeetCode113 {
	
	  List<List<Integer>> re_list = new ArrayList<List<Integer>>();
	    
	    public int DFS(TreeNode root,int sum,List<Integer> list,int current) {
	        if(root==null) return 0;
	        List<Integer> tmp_list = new ArrayList<Integer>();
	        tmp_list.addAll(list);
	        if(root.left==null&&root.right==null&&(root.val+current)==sum) {
	            tmp_list.add(root.val);
	            re_list.add(tmp_list);
	        }
	        else{
	            tmp_list.add(root.val);
	            if(root.left!=null) DFS(root.left,sum,tmp_list,current+root.val);
	            if(root.right!=null) DFS(root.right,sum,tmp_list,current+root.val);
	        }
	        return 1;
	    }
	    
	    public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<Integer> list = new ArrayList<Integer>();
	        DFS(root,sum,list,0);
	        return re_list;
	    }

}
