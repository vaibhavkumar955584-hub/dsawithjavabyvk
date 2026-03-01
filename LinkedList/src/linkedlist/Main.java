package linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        // list.insertRec(88, 2);
        list.display();

        // DoublyLinkedList list2 = new DoublyLinkedList();
        // list2.insertFirst(3);
        // list2.insertFirst(2);
        // list2.insertFirst(8);
        // list2.insertFirst(17);
        // list2.insertLast(99);
        // list2.insert(8, 65);
        //
        // list2.display();

        // CircularLinkedList list3 = new CircularLinkedList();
        // list3.insert(23);
        // list3.insert(3);
        // list3.insert(19);
        // list3.insert(75);
        // list3.display();
        // list3.delete(19);
        // list3.display();
    }
}
