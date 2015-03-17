package Solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a linked list, determine if it has a cycle in it.
 * @author wangqiang
 *
 */
public class LeetCode141 {
	
	 public boolean hasCycle(ListNode head) {
         Map<ListNode,Integer> map = new HashMap<ListNode,Integer>();
        while(head!=null) {
            if(!map.containsKey(head)) {
                map.put(head,1);
                head = head.next;
            }
            else return true;
        }
        return false;
    }

}
