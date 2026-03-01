package linkedlist;

public class DoublyLinkedList {
    private Node Head;

    public void insetFirst(int val) {
        Node node = new Node(val);
        node.next = Head;
        node.prev = null;
        if (Head != null) {
            Head.prev = node;
        }
        Head = node;
    }

    public void inserLast(int val) {
        Node node = new Node(val);
        Node last = Head;
        node.next = null;
        if (Head == null) {
            node.prev = null;
            Head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("does not found");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    // to find the node
    public Node find(int value) {
        Node node = Head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node node = Head;
        Node last = null;// track the last node
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("print the reverse L");
        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
