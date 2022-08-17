public void reverseDI() {
  // write your code here
  int left = 0, right = this.size-1;
  while(left<=right){
    Node n1 = getNodeAt(left);
    Node n2 = getNodeAt(right);

    int temp = n1.data;
    n1.data = n2.data;
    n2.data = temp;
    left++;
    right--;
  }
}


//two pointers are used, at front and end of the linked list
//then their data is swapped 