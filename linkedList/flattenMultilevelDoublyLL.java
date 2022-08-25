class Solution {
    public Node tail(Node node){
        if(node == null) return null;
        while(node.next!=null){
            node = node.next;
        }
        return node;
    }
    public Node flatten(Node head) {
        Node cur = head;
        while(cur!=null){
            if(cur.child != null){
               Node tail = tail(cur.child);
                tail.next = cur.next;
                if(cur.next!=null)cur.next.prev = tail;
                cur.next = cur.child;
                cur.child.prev = cur;
                cur.child = null;
            }
            cur = cur.next;
        }
        return head;
    }
}