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
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new_node;
        new_node.prev = curr;
    }

    public void insert_after(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;

        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }

    }

    public void deleteNode(Node node_to_delete) {

        if (head == null || node_to_delete == null) return;

        if (node_to_delete == head) head = node_to_delete.next;

        if (node_to_delete.next != null) node_to_delete.next.prev = node_to_delete.prev;

        if (node_to_delete.prev != null) node_to_delete.prev.next = node_to_delete.next;

        return;
    }

    public void deleteNodeByIndex(int index) {
        if (head == null || index < 0) return;
        Node curr = head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }

        if(curr == null) return;

        deleteNode(curr);
    }


}

public class DoublyLinkedList {

    public static void main(String[] args) {

    }
}
