public static Node linearize(Node node){
      if(node.children.size() == 0)return node;
      Node lct = linearize(node.children.get(node.children.size()-1));
      while(node.children.size() > 1){
        Node lc = node.children.remove(node.children.size()-1);
        Node slc = node.children.get(node.children.size()-1);
        Node slct = linearize(slc);
        slct.children.add(lc);
      }
      return lct;
  }