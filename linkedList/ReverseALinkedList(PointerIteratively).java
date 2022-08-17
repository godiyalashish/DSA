public void reversePI(){
  // write your code here
  Node cur = this.head, prev = null;

  while(cur!=null){
    Node next = cur.next;
    cur.next = prev;
    prev = cur;
    cur = next;
  }
  Node temp = this.head;
  this.head = this.tail;
  this.tail = temp;
}

//we use 3 pointers cur, next, prev at starting prev points to null, 
//cur points to head, next points to second node 