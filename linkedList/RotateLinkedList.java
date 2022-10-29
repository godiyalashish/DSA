class Solution {
    public int size(ListNode head){
        ListNode p = head;
        int size =0;
        
        while(p!=null){
            p = p.next;
            size++;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        int size = size(head);
        
         k = k%size;
        if(k==0){
            return head;
        }
        ListNode fast = head, slow = head;
        int r = k;
        while(r != 0){
            fast = fast.next;
            r--;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        System.out.println(slow.next.val);
        
        ListNode NewHead = slow.next;
        fast.next = head;
        slow.next =null;
        head = NewHead;
        return head;
    }
}