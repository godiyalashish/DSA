import java.util.*;
public class constructAndDisplayBT{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static class pair{
        Node node;
        int state;
        pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }
    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = "";
        str += node.left == null ? "." : node.left.data+"";
        str += " -> "+ node.data + " <- ";
        str += node.right == null ? "." : node.right.data+"";
        System.out.println(str);
        
        display(node.left);
        display(node.right);
    }
    public static Node construct(Integer arr[]){
        Node root = new Node(arr[0], null, null);
        pair rootPair = new pair(root, 1);
        Stack<pair> st = new Stack<>();
        st.push(rootPair);
        int idx =0;
        while(st.size() > 0){
         pair top = st.peek();
         if(top.state == 1){
             idx++;
             if(arr[idx] != null){
                top.node.left = new Node(arr[idx], null, null);
                 st.push(new pair(top.node.left, 1));
             }else{
                 top.node.left = null;
             }
             top.state++;
         }else if(top.state == 2){
             idx++;
             if(arr[idx] != null){
                top.node.right = new Node(arr[idx], null, null);
                 st.push(new pair(top.node.right, 1));
             }else{
                 top.node.right = null;
             }
             top.state++;
         }else{
             st.pop();
         }
        }
        return root;
    }
    public static void main(String[] args) {
        Integer arr[] = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        
        Node root = construct(arr);
        display(root);
    }
}
