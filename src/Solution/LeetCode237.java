package Solution;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * @author qiang
 *
 */
public class LeetCode237 {
	
	 public void deleteNode(ListNode node) {
	        node.val = node.next.val;
	        node.next = node.next.next;
	    }

}
