

public class Singley_LinkedList {
    private Node Head ,Tail;

    public Singley_LinkedList() {
        this.size = 0;
    }

    private int size;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return ;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=Head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    void insertLast(int val) {
        if(Tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        Tail.next=node;
        Tail=node;
        size++;
    }

    void insertFirst(int val) {
        Node node=new Node(val);
        node.next=Head;
        Head=node;
        if(Tail==null){
            Tail=Head;
        }
        size+=1;
    }

    public void display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //get node by enter the index
    public Node get(int index){
        Node node=Head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteFirst(){
       int val=Head.value;
       Head=Head.next;
       if(Head==null){
           Tail=null;
       }
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=Tail.value;
        Tail=secondLast;
        Tail.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
      Singley_LinkedList first=new Singley_LinkedList();
      first.insertFirst(3);
      first.insertFirst(4);
      first.insertFirst(23);
      first.display();
    }
}
