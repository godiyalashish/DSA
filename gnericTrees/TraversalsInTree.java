public static void traversals(Node node){
    System.out.println("Node Pre "+ node.data);//Node pre
    for(Node child : node.children){
        System.out.println("Edge Pre "+ node.data+"--"+child.data);//Edge pre
        traversals(child);
        System.out.println("Edge Post "+ node.data+"--"+child.data);//Edge post
    }
    System.out.println("Node Post "+ node.data);//Node post
}