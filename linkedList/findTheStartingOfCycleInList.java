public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode p = head;
                while(p!=slow){
                    p=p.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}