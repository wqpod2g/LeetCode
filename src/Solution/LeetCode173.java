package Solution;

import java.util.Stack;


/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

 * Calling next() will return the next smallest number in the BST.

 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * @author wangqiang
 *
 */
public class LeetCode173 {
	
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

	public class BSTIterator {
	    
	    Stack<TreeNode>stack = new Stack<TreeNode>();

	    public BSTIterator(TreeNode root) {
	        while(root!=null) {
	            stack.push(root);
	            root = root.left;
	        }
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stack.empty();
	    }

	    /** @return the next smallest number */
	    public int next() {
	        TreeNode p = stack.pop();
	        int re = p.val;
	        p = p.right;
	        if(p!=null) {
	            stack.push(p);
	            while(p.left!=null) {
	                stack.push(p.left);
	                p = p.left;
	            }
	            
	        }
	        return re;
	    }
	}

	/**
	 * Your BSTIterator will be called like this:
	 * BSTIterator i = new BSTIterator(root);
	 * while (i.hasNext()) v[f()] = i.next();
	 */

}
