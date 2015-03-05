package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author mrpod2g
 *
 */

public class LeetCode94 {
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
		

	    
	    List<Integer> re_list = new ArrayList<Integer>();
	    //中序遍历二叉树
	    public void IFS(TreeNode N) {
	        if(N!=null) {
	            if(N.left!=null) IFS(N.left);
	            re_list.add(N.val);
	            if(N.right!=null) IFS(N.right);
	        }
	    } 
	    
	    public List<Integer> inorderTraversal(TreeNode root) {
	        IFS(root);
	        return re_list;
	    }
	}

}
