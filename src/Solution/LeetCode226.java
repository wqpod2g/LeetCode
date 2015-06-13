package Solution;

public class LeetCode226 {
	
	 public TreeNode invertTree(TreeNode root) {
	        if(root!=null) {
	            TreeNode tmp = root.left;
	            root.left = root.right;
	            root.right = tmp;
	            invertTree(root.left);
	            invertTree(root.right);
	        }
	        return root;
	    }

}
