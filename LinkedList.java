public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        public static Node head;
        public static Node tail;
        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addlast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public void print(){
            if(head==null){
                System.out.println( "LL IS EMPTY");
                return;
            }
            Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
            


        }
        System.out.println("null");
        }
        public void add (int idx,int data){
            Node newNode =new Node(data);
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;


        }
        
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        
        ll.addFirst(7);
        
        ll.addlast(9);

        ll.addlast(25);
        ll.print();
        
        
        
    }
}