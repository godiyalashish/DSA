class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node Chead = Cyclehead(head);
        if(Chead == null)return 0;
        int count =0;
        Node temp = Chead;
        while(true){
            temp = temp.next;
            count++;
            if(temp == Chead){return count;}
        }
        //Add your code here.
    }
    
    public static Node Cyclehead(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node p = head;
                while(p!=slow){
                    p=p.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}