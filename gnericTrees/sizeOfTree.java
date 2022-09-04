public static int size(Node node){
    int s = 0;
    if(node.children.size() > 0 ){
    for(int i=0; i<node.children.size(); i++){
      s += size(node.children.get(i));
      }
    }
    return s+1;
  }