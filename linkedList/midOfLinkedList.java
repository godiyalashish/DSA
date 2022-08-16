public int mid(){
    // write your code here
    Node slow,fast;
    slow = fast = this.head;
    if(this.size()%2 == 0){
      while(fast.next!= this.tail){
        slow = slow.next;
        fast = (fast.next).next;
      }
    }else{
      while(fast!= this.tail){
        slow = slow.next;
        fast = (fast.next).next;
      }
    }

    return slow.data;
  }

//slow pointer will move one step ahead and fast pointer will move 2 steps ahead
//for odd length condition is when fast pointer reaches tail
//for even length condition is when fast.next is equal to tail  