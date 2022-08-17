class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        
        while(cur!=null){
            if(prev.val != cur.val){
                prev.next = cur;
                prev = cur;
            }
            cur = cur.next;
        }
        
        prev.next = cur;
        return head;
        
    }
}