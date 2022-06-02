// segregate even odd
/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution{
    Node divide(int N, Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node even = new Node(0);
        Node odd = new Node(0);

        Node evenTail = even , oddTail = odd;
        Node curr = head;

        while(curr != null){
            if(curr.data % 2 == 0){
                evenTail.next = curr;
                evenTail = evenTail.next;
            }else {
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            curr = curr.next;
        }

        oddTail.next = null;
        evenTail.next = null;

        evenTail.next = odd.next;

        return even.next;
    }


}