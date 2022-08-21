Node divide(int N, Node head){
    // code here
    Node d1 = new Node(0);
    Node d2 = new Node(0);
    
    Node p1 = d1, p2 = d2, p3 = head;
    
    while(p3!=null){
        if(p3.data%2 == 0){
            p1.next = p3;
            p1 = p1.next;
            p3 = p3.next;
        }else{
            p2.next = p3;
            p2 = p2.next;
            p3 = p3.next;
        }
    }
    p1.next = p2.next = null;
    
    p1.next = d2.next;
    return d1.next;
}
