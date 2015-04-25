package Solution;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 * @author wangqiang
 *
 */
public class LeetCode82 {
	
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode h = new ListNode(0);
	        h.next = head;
	        ListNode pre = h;
	        ListNode p = head;
	        int flag = 0;
	        while(p!=null) {
	            if(p.next!=null&&p.val==p.next.val) {
	                flag = 1;
	                p.next = p.next.next;
	            }
	            else if(flag==1) {
	                pre.next = p.next;
	                p = p.next;
	                flag = 0;
	            }
	            else {
	                pre = pre.next;
	                p = p.next;
	            }
	        }
	        return h.next;
	    }

}
