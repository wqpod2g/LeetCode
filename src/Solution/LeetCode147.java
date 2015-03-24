package Solution;

/**
 * Sort a linked list using insertion sort.
 * @author wangqiang
 *
 */
public class LeetCode147 {
	
	 public ListNode insertionSortList(ListNode head) {
	        ListNode h = new ListNode(Integer.MIN_VALUE);//新建一个头结点
	        while(head!=null) {
	            ListNode tmp = head.next;
	            ListNode p = h;
	            while(p!=null) {
	                if(p.next==null) {
	                    p.next = head;
	                    head.next = null;
	                    break;
	                }
	                else if(head.val>=p.val&&head.val<p.next.val) {
	                    head.next = p.next;
	                    p.next = head;
	                    break;
	                }
	                p = p.next;
	            }
	            head = tmp;
	        }
	        return h.next;
	    }

}
