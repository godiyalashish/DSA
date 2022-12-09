class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node cpy = new Node(temp.val);
            hm.put(temp, cpy);
            temp = temp.next;
        }

        for(Node n: hm.keySet()){
            Node cpy = hm.get(n);
            cpy.next = hm.get(n.next);
            cpy.random = hm.get(n.random);
        }
        return hm.get(head);
    }
}