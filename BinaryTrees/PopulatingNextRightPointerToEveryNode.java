class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> mq = new ArrayDeque<>();
        Queue<Node> cq = new ArrayDeque<>();
        mq.add(root);
        while(mq.size() > 0){
            Node rem1 = mq.remove();
            Node rem2 = null;
            if(mq.size() != 0){
                rem2 = mq.peek();
            }
            rem1.next = rem2;
            if(rem1.left != null){
                cq.add(rem1.left);
            }
            if(rem1.right != null){
                cq.add(rem1.right);
            }
            if(mq.size() == 0){
                mq = cq;
                cq = new ArrayDeque<>();
            }
        }
        return root;
    }
}


//ssolution using only one queue
class Solution {
    public Node connect(Node root){
        if(root == null) return null;
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);
        
        while(mq.size() > 0){
            int size = mq.size();
           Node temp = null;
            while(size > 0){
                Node rem = mq.remove();
                if(temp == null){
                    temp = rem;
                }
                else{
                    temp.next = rem;
                    temp = temp.next;
                }
                if(rem.left != null){
                    mq.add(rem.left);
                }
                if(rem.right != null){
                    mq.add(rem.right);
                }
                size--;
            }
        }
        return root;
    }
}

//solution only for perfect binary tree 
class Solution {
    public Node connect(Node root) {
        if(root == null)return null;
        Node start = root;
        while(start != null && start.left != null){
            Node node = start;
            while(node != null){
                node.left.next = node.right;
                if(node.next != null){
                    node.right.next = node.next.left;
                }
                node = node.next;
            }
            start = start.left;
        }
        return root;
    }
}