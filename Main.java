import java.util.ArrayList;
public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class CircularLinkedList {
        Node head = null;
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head;  
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;  
                }
                temp.next = newNode;
                newNode.next = head;  
                head = newNode;  
            }
        }
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head;  
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;  
                }
                temp.next = newNode;
                newNode.next = head;  
            }
        }
        public void insertAfter(int data, int item) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == item) {
                    Node newNode = new Node(data);
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
                if (temp == head) break;  
            }
        }
        public void deleteAtBeginning() {
            if (head == null) return;  

            if (head.next == head) {  
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;  
                }
                temp.next = head.next;  
                head = head.next;  
            }
        }
        public void deleteAtEnd() {
            if (head == null) return;  

            if (head.next == head) {  
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;  
                }
                Node secondLast = head;
                while (secondLast.next != temp) {
                    secondLast = secondLast.next;  
                }
                secondLast.next = head;  
            }
        }
        public void deleteNode(int key) {
            if (head == null) return;  

            if (head.data == key) {  
                deleteAtBeginning();
                return;
            }
            Node temp = head;
            while (temp.next != head && temp.next.data != key) {
                temp = temp.next;
            }
            if (temp.next == head) {
                System.out.println("Node not found.");
                return;
            }
            temp.next = temp.next.next;  
        }
        public void traverse() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);  
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAfter(25, 20);
        list.traverse();  
        list.deleteAtBeginning();
        list.traverse();   
        list.deleteAtEnd();
        list.traverse(); 
        list.deleteNode(25);
        list.traverse();  
    }
}
