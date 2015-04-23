package Solution;


/**
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 * @author wangqiang
 *
 */
public class LeetCode203 {
	
	 public ListNode removeElements(ListNode head, int val) {
	        ListNode h = new ListNode(0);
	        h.next = head;
	        ListNode pre = h;
	        ListNode p = head;
	        while(p!=null) {
	            if(p.val==val) {
	                pre.next = p.next;
	                p = p.next;
	            }
	            else {
	               pre = pre.next;
	               p = p.next;  
	            }
	        }
	        return h.next;
	    }

}
