package Solution;


/**
 * 
 * @author wangqiang
 *
 */
public class AddTwoNumbers {
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode p1 = l1;
	        ListNode p2 = l2;
	        ListNode h = new ListNode(0);//创建一个头结点
	        ListNode r = h;//设立一个尾指针
	        int carry = 0;//进位
	        int sum = 0;//对应位及进位相加之和
	        while(p1!=null||p2!=null) {
	            
	            if(p1!=null&&p2!=null){
	                sum = p1.val+p2.val+carry;
	                p1 = p1.next;
	                p2 = p2.next;
	            }
	            
	            else {
	                if(p1==null) {
	                    sum = p2.val+carry;
	                    p2 = p2.next;
	                }
	                else {
	                    sum = p1.val+carry;
	                    p1 = p1.next;
	                }
	            }
	            
	            if(sum>=10) {
	                sum = sum-10;
	                carry = 1;
	            }
	            else {
	                carry = 0;
	            }
	            ListNode p = new ListNode(sum);
	            r.next = p;
	            r = p;
	        }
	        if(carry==1) {
	            ListNode p = new ListNode(1);
	            r.next = p;
	            r = p;
	        }
	        return h.next;
	    }

}
