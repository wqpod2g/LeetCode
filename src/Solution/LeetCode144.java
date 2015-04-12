package Solution;

import java.util.ArrayList;
import java.util.List;


/**
 * Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
 * @author wangqiang
 *
 */
public class LeetCode144 {
	
	 List<TreeNode> list = new ArrayList<TreeNode>();
	    
	    public void PreOrderTraverse(TreeNode root) {
	        if(root!=null) {
	            list.add(root);
	            if(root.left!=null) PreOrderTraverse(root.left);
	            if(root.right!=null) PreOrderTraverse(root.right);
	        }
	    }
	    
	    public void flatten(TreeNode root) {
	        PreOrderTraverse(root);
	        for(int i=0;i<list.size()-1;i++) {
	            list.get(i).left = null;
	            list.get(i).right =  list.get(i+1);
	        }
	    }

}
