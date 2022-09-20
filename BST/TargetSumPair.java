public static class Itpair{
    Node node;
    int state;
    Itpair(Node node, int state){
        this.node = node;
        this.state = state;
    }
}

public static Node getNextFromNormalInorder(Stack<Itpair> st){
    while(st.size() > 0){
      Itpair top = st.peek();
      
      if(top.state  == 0){
          if(top.node.left != null){
              Itpair lc = new Itpair(top.node.left, 0);
              st.push(lc);
          }
          top.state++;
      }else if(top.state == 1){
          if(top.node.right != null){
              Itpair rc = new Itpair(top.node.right, 0);
              st.push(rc);
          }
          top.state++;
          return top.node;
      }else{
          st.pop();
      }
    }
    return null;
}

public static Node getNextFromReverseInorder(Stack<Itpair> st){
    while(st.size() > 0){
      Itpair top = st.peek();
      
      if(top.state == 0){
          if(top.node.right != null){
              Itpair rc = new Itpair(top.node.right, 0);
              st.push(rc);
          }
          top.state++;
      }else if(top.state == 1){
          if(top.node.left != null){
              Itpair lc = new Itpair(top.node.left, 0);
              st.push(lc);
          }
          top.state++;
          return top.node;
      }else{
          st.pop();
      }
    }
   return null; 
}

public static void tsp(Node node, int tar){
    Stack<Itpair> ls = new Stack<>(); 
    Stack<Itpair> rs = new Stack<>();
    
    ls.push(new Itpair(node, 0));
    rs.push(new Itpair(node, 0));
    
    Node left = getNextFromNormalInorder(ls);
    Node right = getNextFromReverseInorder(rs);
    
    while(left.data < right.data){
        if(left.data+right.data > tar){
            right = getNextFromReverseInorder(rs);
        }else if(left.data+right.data < tar){
            left = getNextFromNormalInorder(ls);
        }else{
            System.out.println(left.data +" "+ right.data);
            left = getNextFromNormalInorder(ls);
            right = getNextFromReverseInorder(rs);
        }
    }
}
