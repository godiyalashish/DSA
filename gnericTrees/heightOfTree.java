public static int height(Node node) {
    // write your code here
    int height = -1;
    
    for(Node child : node.children){
        int childheight  = height(child);
        height = Math.max(childheight, height);
    }
    
    return height+1;
  }