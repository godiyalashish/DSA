//find the mid of LL and break it form there
//now reverse the broken part of linked list(list after mid of orignal LL)
//use three pointers to re-join the list in reorderd form.

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = mid(head);
        ListNode head2 = mid.next;
        mid.next = null;
        head2 = reverse(head2);
        
        ListNode p1 = head;
        ListNode p2 = head2;
        ListNode dummy = new ListNode();
        
        ListNode p3 = dummy;
        
        while(p1!=null && p2!=null){
            p3=p1;
            p1 = p1.next;
            p3.next = p2;
            
            p3=p2;
            p2 = p2.next;
            p3.next = p1;
        }
        p3.next = p1;
        
    }
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null || head.next == null){
            return null;
        }
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode cur = head;
        ListNode prev = null;
        
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}