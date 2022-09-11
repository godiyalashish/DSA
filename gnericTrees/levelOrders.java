public static void levelOrderLineWise(Node node){
    Queue<Node> mq = new ArrayDeque<>();
    Queue<Node> cq = new ArrayDeque<>();
    
    mq.add(node);
    while(mq.size()>0){
        node= mq.remove();
        System.out.print(node.data+" ");
        for(Node child : node.childrens){
            cq.add(child);
        }
        if(mq.size() == 0){
            mq = cq;
            cq = new ArrayDeque<>();
            System.out.println();
        }
    }
}
public static void levelOrder(Node node) {
Queue<Node> q = new ArrayDeque<>();
q.add(node);
while(q.size()>0){
    Node n  = q.remove();
    System.out.print(n.data+" ");
    for(Node child : n.childrens){
        q.add(child);
    }
}
}
public static void levelOrderZigZag(Node node){
    Stack<Node> ms = new Stack<>();
    Stack<Node> cs = new Stack<>();
    int level = 1;
    ms.push(node);
    while(ms.size() > 0){
        node = ms.pop();
        System.out.print(node.data+" ");
        if(level%2 == 1){
            for(int i=0; i<node.childrens.size(); i++){
                 Node child = node.childrens.get(i);
                cs.push(child);
            }
        }else{
            for(int i=node.childrens.size()-1; i>=0; i--){
                Node child = node.childrens.get(i);
                cs.push(child);
            }
        }
        if(ms.size() == 0){
            ms = cs;
            cs = new Stack<>();
            level++;
            System.out.println();
        }
        
        
    }
}public class levelOrders {
    
}
