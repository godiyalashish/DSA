class Solution {
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