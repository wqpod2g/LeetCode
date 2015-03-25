package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.
 * @author wangqiang
 *
 */
public class LeetCode129 {
	
	 List<String> num_list = new ArrayList<String>();
	    
	    public void DFS(TreeNode root,String num) {
	        if(root!=null) {
	            if(root.left==null&&root.right==null) num_list.add(num+root.val);
	            if(root.left!=null) DFS(root.left,num+root.val);
	            if(root.right!=null) DFS(root.right,num+root.val);
	        }
	    }
	    
	    public int sumNumbers(TreeNode root) {
	        String num = "";
	        DFS(root,num);
	        int sum = 0;
	        for(String s:num_list) {
	            sum = sum+Integer.valueOf(s);
	        }
	        return sum;
	    }

}
