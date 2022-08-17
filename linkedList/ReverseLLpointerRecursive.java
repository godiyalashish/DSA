private void reversePRHelper(Node node){
    if(node == null || node == tail){
      return;
    }
    reversePRHelper(node.next);
    node.next.next = node;
  }

  public void reversePR(){
    reversePRHelper(head);
    this.head.next = null;
    Node tmp = this.head;
    this.head = this.tail;
    this.tail = tmp;
  }

  //next property of the node is changed after returning from recursive call
  // if linked list is: 1->2->3->4->5->null
  //reverse call is made until we reach to null 
  //if we are at null or at last node we simply return
  //now we are at 4 line number 6 is executed which makes linked list as 1->2->3->4<-5->null