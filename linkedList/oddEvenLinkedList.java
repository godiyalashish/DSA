class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        
        ListNode p1 = d1, p2 = d2, p3 = head;
        int index =1;
        
        while(p3!=null){
            if(index%2 == 0){
                p1.next = p3;
                p1 = p1.next;
                p3 = p3.next;
            }else{
                p2.next = p3;
                p2 = p2.next;
                p3 = p3.next;
            }
            index++;
        }
        p1.next = p2.next = null;
        
        p2.next = d1.next;
        return d2.next;
    }
}