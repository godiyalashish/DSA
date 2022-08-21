//break list into two parts after the mid point and then reverse the another part 
//the compare those two LL elements for palindrome


class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode mid = mid(head);
        ListNode head2 = mid.next;
        mid.next = null;
        head2 = reverse(head2);
        
        ListNode p1 = head;
        ListNode p2 = head2;
        
        while(p1!=null && p2!=null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
        
    }
    
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null || head.next == null){
            return null;
        }
        
        while(fast.next!=null && fast.next.next!=null){
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