import java.util.*;
public class Main{
    static class Node{
        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data = data;
            children = new ArrayList<>();
        }
    }
    public static Node construct(Integer []arr){
        Stack<Node> st = new Stack<>();

        Node root = new Node(arr[0]);
        st.push(root);

        int idx = 1;
        while(idx < arr.length){
            Integer val = arr[idx];

            if(val == null){
                st.pop();
            }else{
                Node node = new Node(val);
                Node par = st.peek();
                par.children.add(node);
                st.push(node);
            }
            idx++;
        }
        return root;
    }
    
    public static void display(Node node){
        System.out.print(node.data+" -> ");
        for(Node child : node.children){
            System.out.print(child.data+" ");
        }
        System.out.println(".");

        for(Node child : node.children){
            display(child);
        }
    }

    public static void levelOrderLinewiseZZ(Node node){
        //HomeWork
        Stack <Node> ms = new Stack<>();
        Stack <Node> hs = new Stack<>();
    
        ms.push(node);
        int level = 0;
    
        while(ms.size() > 0){
          if(level%2 == 0){
            Node rem = ms.pop();
            System.out.print(rem.data+" ");
            for (Node n : rem.children) {
              hs.push(n);
            }
          }else{
            Node rem = ms.pop();
            System.out.print(rem.data+" ");
            for(int i=rem.children.size()-1; i>=0; i--){
              hs.push(rem.children.get(i));
            }
          }
    
          if(ms.size() == 0){
            level++;
            Stack <Node> ts = ms;
            ms = hs;
            hs = ts;
            System.out.println();
          }
        }
      }

    public static void traversals(Node node){
        System.out.println("Node Pre "+node.data);

        for(Node child : node.children){
        System.out.println("Edge Pre "+node.data+"--"+child.data);
        traversals(child);
        System.out.println("Edge Post "+node.data+"--"+child.data);
        }

        System.out.println("Node Post "+node.data);
    }

    public static void main(String args[]){
        Integer []arr = {10, 20, 50, null, 60, null, null, 30, 70, 90, null, 100, null, 110, null, null, null, 40, 80, null, null, null};
        Node root = construct(arr);
        display(root);
        int treeSize = size(root);
        System.out.println(treeSize);
    }
}