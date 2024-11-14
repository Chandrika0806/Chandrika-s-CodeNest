class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DeleteOccurrenceInDoublyLinkedList {

    static void deleteNode(Node head_ref, Node node_to_delete) {
        if (head_ref == null || node_to_delete == null) {
            return;
        }

        if (node_to_delete.prev == null && node_to_delete.next == null) {
            head_ref = null;
            return;
        }

        if (node_to_delete == head_ref) {
            head_ref = node_to_delete.next;
        }

        if (node_to_delete.prev != null) {
            node_to_delete.prev.next = node_to_delete.next;
        }

        if (node_to_delete.next != null) {
            node_to_delete.next.prev = node_to_delete.prev;
        }

        node_to_delete = null;
    }

    static Node deleteAllOccurOfX(Node head, int x) {
        if (head == null) {
            return head;
        }

        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;

            if (current.data == x) {
                deleteNode(head, current);
            }

            current = next;
        }

        return head;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(10);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(8);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        System.out.println("Original list:");
        printList(head);

        int x = 2;
        head = deleteAllOccurOfX(head, x);

        System.out.println("List after deleting all occurrences of " + x + ":");
        printList(head);
    }
}
