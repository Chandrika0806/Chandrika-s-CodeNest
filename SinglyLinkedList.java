class Node {
    int data;    // Data stored in the node
    Node next;   // Pointer to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head; // Head of the linked list

    public SinglyLinkedList() {
        this.head = null; // Initialize an empty list
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to the current head
        head = newNode; // Update head to the new node
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If list is empty, new node becomes head
            return;
        }
        Node current = head;
        while (current.next != null) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Link the last node to the new node
    }

    // Insert at a specific position
    public void insertAtMiddle(int data, int position) {
        if (position < 0) {
            System.out.println("Position should be non-negative.");
            return;
        }
        if (position == 0) { // If position is 0, insert at beginning
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next; // Link new node to the next node
        current.next = newNode; // Link current node to new node
    }

    // Update a node at a specific position
    public void updateNode(int position, int newData) {
        Node current = head;
        for (int i = 0; i < position; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        current.data = newData; // Update the data of the node
    }

    // Delete at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next; // Update head to the next node
    }

    // Delete at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) { // If there's only one node
            head = null; // List becomes empty
            return;
        }
        Node current = head;
        while (current.next.next != null) { // Traverse to the second last node
            current = current.next;
        }
        current.next = null; // Remove the last node
    }

    // Delete at a specific position
    public void deleteAtMiddle(int position) {
        if (position < 0) {
            System.out.println("Position should be non-negative.");
            return;
        }
        if (position == 0) { // If position is 0, delete at beginning
            deleteAtBeginning();
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        current.next = current.next.next; // Bypass the node to delete
    }

    // Traverse the linked list
    public void traverse() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }

    // Get the length of the linked list
    public int getLength() {
        Node current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // Main method for testing
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Insertion operations
        linkedList.insertAtBeginning(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtMiddle(15, 1); // Insert 15 at position 1
        linkedList.traverse(); // Output: 10 -> 15 -> 20 -> 30 -> null

        // Update a node
        linkedList.updateNode(1, 25); // Update position 1 to 25
        linkedList.traverse(); // Output: 10 -> 25 -> 20 -> 30 -> null

        // Deletion operations
        linkedList.deleteAtBeginning(); // Remove first node
        linkedList.traverse(); // Output: 25 -> 20 -> 30 -> null
        linkedList.deleteAtEnd(); // Remove last node
        linkedList.traverse(); // Output: 25 -> 20 -> null
        linkedList.deleteAtMiddle(0); // Remove node at position 0
        linkedList.traverse(); // Output: 20 -> null

        // Get the length of the list
        System.out.println("Length of the linked list: " + linkedList.getLength()); // Output: 1
    }
}
