public static boolean find(Node node, int data){
    if(node == null) return false;
    
    if(node.data == data){
        return true;
        
    }
    
   if(find(node.left, data)){
       return true;
   }
    if(find(node.right, data)){
        return true;
    }
    return false;
    
  }