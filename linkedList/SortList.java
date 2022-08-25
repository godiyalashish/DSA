class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)return head;
        ListNode slow = head, fast = head,prev=null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(slow);
        
        return mergeTwoLists(leftSorted, rightSorted);
        
    }
    
    public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        ListNode dummy = new ListNode();
        ListNode ptr = dummy;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                ptr.next = p1;
                ptr = p1;
                p1 = p1.next;
            }else{
                ptr.next = p2;
                ptr = p2;
                p2 = p2.next;
            }
        }
        if(p1==null){
            ptr.next = p2;
        }else{
            ptr.next = p1;
        }
        return dummy.next;
    }
}