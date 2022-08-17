class MyLinkedList {
    
    public static class Node{
        int val;
        Node next;
        Node prev;
    }
    
    Node head, tail;
    int size;

    public MyLinkedList() {
        this.head =null; 
        this.tail = null;
        this.size = 0;
    }
    public int get(int index) {
        if(index<0 || index>this.size-1) return -1;
        Node t = this.head;
        while(index>0){
            t = t.next;
            index--;
        }
        return t.val;
    }
    
    public void addAtHead(int val) {
        Node n = new Node();
        n.val = val;
        if(size==0){
            this.head = this.tail = n;
            this.size++;
            return;
        }
        n.next = this.head;
        this.head.prev = n;
        this.head = n;
        this.size++;
        return;
    }
    
    public void addAtTail(int val) {
        Node n = new Node();
        n.val = val;
        if(this.size==0){
            this.head = this.tail = n;
            this.size++;
            return;
        }
        n.prev = this.tail;
        this.tail.next = n;
        this.tail = n;
        size++;
        return;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>this.size || index<0)return;
        if(index == 0){ this.addAtHead(val); return;}
        if(index == this.size){this.addAtTail(val); return;}
        Node t = this.head;
        while(index>0){
            t = t.next;
            index--;
        }
        
        Node n = new Node();
        n.val = val;
        n.prev = t.prev;
        n.next = t;
        n.prev.next = n;
        t.prev =n;
        this.size++;
    }
    
    public void removeFirst(){
        if(this.size==0){
            return;
        }
        if(this.size == 1){
            this.head = this.tail = null;
            this.size--;
        }else{
            this.head = this.head.next;
            this.size--;
        }
    }
    
    public void removeLast(){
        if(this.size==0){
            return;
        }
        if(this.size == 1){
            this.head = this.tail = null;
            this.size--;
        }else{
            this.tail = this.tail.prev;
            this.size--;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>this.size-1)return;
        if(index == 0){this.removeFirst(); return;}
        if(index == this.size-1){this.removeLast(); return;}
        Node cur = this.head;
        Node next = cur.next;
        Node prev = null;
        while(index>0){
            prev = cur;
            cur = cur.next;
            next = cur.next;
            next = cur.next;
            index--;
        }
        
        prev.next = next;
        next.prev = prev;
        this.size--;
        
        
    }
}
