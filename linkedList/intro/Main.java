public class Main {
    // public static class Person{
    //     String name;
    //     int age;
    // }   
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node node = new Node();
            node.data = val;

            if(this.size == 0){
                this.head = node;
                this.tail = node;
            }else{
                this.tail.next = node;
                this.tail = node;
            }
            this.size++;
        }

        int size(){
            return this.size;
        }

        void display(){
            Node temp = this.head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

        void delete(){
            if(this.size == 0){
                System.out.println("List is empty");
            }
            else if(this.size == 1){
                this.head = null;
                this.tail = null;
                this.size = 0;
            }else{
                Node temp = this.head;
                this.head = this.head.next;
                this.size--;
                temp.next = null;
            }

        }
    }
    public static void main(String[] args) {
        // Person p1 = new Person();
        // System.out.println(p1.name+" "+p1.age);
        // p1.name = "rohit";
        // p1.age = 23;
        // System.out.println(p1.name+" "+p1.age);
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        System.out.println(ll.size());
        ll.display();
    }
}