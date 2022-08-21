public static void unfold(ListNode head) {
    if(head == null || head.next == null || head.next.next == null){
        return;
    }
    ListNode D1 = new ListNode(0);
    ListNode D2 = new ListNode(0);

    ListNode p1 = D1;
    ListNode p3 = head;
    ListNode p2 = D2;

    boolean flag = true;

    while(p3 != null){
        if(flag){
            p1.next = p3;
            p1 = p3;
            p3 = p3.next;
            flag = !flag;
        }else{
            p2.next = p3;
            p2 = p3;
            p3 = p3.next;
            flag = !flag;
        }
    }
    p1.next = p2.next = null;

    ListNode head2 = D2.next;
    head2 = reverse(head2);
    p1.next = head2;

}

public static ListNode reverse(ListNode head){
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