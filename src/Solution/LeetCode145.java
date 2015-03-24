package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].
 * @author mrpod2g
 *
 */
public class LeetCode145 {
	
	 List<Integer> list = new ArrayList<Integer>();
	    
	    public void POT(TreeNode root) {
	        if(root!=null) {
	            if(root.left!=null) POT(root.left);
	            if(root.right!=null) POT(root.right);
	            list.add(root.val);
	        }
	    }
	    
	    public List<Integer> postorderTraversal(TreeNode root) {
	        POT(root);
	        return list;
	    }

}
