class GfG
{
   boolean isCircular(Node head)
   {
 Node slow=head,fast=head;
 
 while(fast!=null&&fast.next!=null){ //check if the point is not the end point of even and odd LL
     slow=slow.next;
     fast=fast.next.next;
     if(fast==slow) return true;    // for cyclic checking
 }
 return false;
   }