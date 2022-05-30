public ListNode deleteMiddle(ListNode head) {
    ListNode dummy = new ListNode(-1), slow = dummy, fast = dummy; 
    dummy.next = head;
    while (fast.next != null && fast.next.next != null) {  
        slow = slow.next; 
        fast = fast.next.next;
    }
    slow.next = slow.next.next;
    return dummy.next; 
}
