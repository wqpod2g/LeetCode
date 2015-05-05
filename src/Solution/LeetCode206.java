package Solution;

/**
 * Reverse a singly linked list.
 * @author wangqiang
 *
 */
public class LeetCode206 {
	
	  public ListNode reverseList(ListNode head) {
	        ListNode h = new ListNode(0);
	        h.next = null;
	        ListNode p = null;
	        while(head!=null) {
	            p = head.next;//记录head的后继
	            head.next = h.next;
	            h.next = head;
	            head = p;
	            if(p!=null)
	            p = p.next;
	        }
	        return h.next;
	    }

}
