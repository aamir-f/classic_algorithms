package linkedlist.doubly;

class Doubly {

    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
        }
    }

    public void prepend(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;

        if (head != null)
            head.prev = new_node;
        head = new_node;
    }

    public void append(int new_data) {

    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {

    }
}
