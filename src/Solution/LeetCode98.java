package Solution;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 * @author wangqiang
 *
 */
public class LeetCode98 {
	
	  double tmp = Integer.MIN_VALUE-1.0;
	    
	    Boolean flag = true;
	    
	    public void IFS(TreeNode root) {
	        if(root!=null) {
	            if(root.left!=null) IFS(root.left);
	            if(root.val<=tmp) flag = false;
	            else tmp = root.val;
	            if(root.right!=null) IFS(root.right);
	        }
	        
	    }
	    
	    public boolean isValidBST(TreeNode root) {
	        IFS(root);
	        return flag;
	    }

}
