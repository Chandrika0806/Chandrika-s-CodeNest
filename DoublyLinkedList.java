class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertInBetween(int data, int afterData) {
        Node temp = head;
        while (temp != null && temp.data != afterData) {
            temp = temp.next;
        }
        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
        } else {
            System.out.println("Node with data " + afterData + " not found.");
        }
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }

    public void deleteInBetween(int data) {
        Node temp = head;
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        } else {
            System.out.println("Node with data " + data + " not found.");
        }
    }

    public void traverse() {
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
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertInBetween(35, 30);
        System.out.println("Doubly Linked List after insertions:");
        list.traverse();
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteInBetween(35);
        System.out.println("Doubly Linked List after deletions:");
        list.traverse();
    }
}
