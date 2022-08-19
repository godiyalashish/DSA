class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
        Node fast = head;
        Node prev = null;
        boolean hascycle = false;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){ hascycle =true; break;}
        }
        if(!hascycle)return;
        //pointer prev is one step behind the slow pointer 
        //when pointer p and slow are equal it means we reached the starting of the loop
        //since prev is one step behind the slow hence slow.next is made null to break the loop
            Node p = head;
            while(p != slow){
                prev = slow;
                slow = slow.next;
                p = p.next;
            }
            prev.next = null;
    }
}