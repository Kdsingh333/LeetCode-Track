/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    boolean ans = false;
    public boolean hasCycle(ListNode head) {

        ListNode slow = head, fast = head;
        if(slow == null){
            return ans;
        }
        
        while(fast.next!=null && fast.next.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
               ans = true;
               break;
            }
        }
        return ans;
    }
}