private void displayReverseHelper(Node node){
    // write your code here
    if(node==null){
      return;
    }
    displayReverseHelper(node.next);
    System.out.print(node.data+" ");
  }

  public void displayReverse(){
    displayReverseHelper(head);
    System.out.println();
  }

//printing is done after recursive call is done.