package Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 * @author wangqiang
 *
 */
public class LeetCode109 {
	
    private List<TreeNode> list = new ArrayList<TreeNode>();
    
    public TreeNode creatBST(int low,int high) {
        if(low<=high) {
            int mid = (high+low)/2;
            TreeNode root = list.get(mid);
            root.left = creatBST(low,mid-1);
            root.right = creatBST(mid+1,high);
            return root;
        }
        else return null;
      
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        while(head!=null) {
            TreeNode node = new TreeNode(head.val);
            list.add(node);
            head = head.next;
        }
        return creatBST(0,list.size()-1);
    }

}
