package Solution;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorder {
	
	public class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		  }
	
	 List<Integer> re = new ArrayList<Integer>();
	    //先序遍历二叉树
	    public void PSF(TreeNode N) {
	        if(N!=null) {
	            re.add(N.val);
	            if(N.left!=null) PSF(N.left);
	            if(N.right!=null) PSF(N.right);
	        }
	    }
	    public List<Integer> preorderTraversal(TreeNode root) {
	        PSF(root);
	        return re;
	    }
	    

}
