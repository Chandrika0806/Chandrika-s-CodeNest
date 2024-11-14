class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class SortedMergeDoublyCircularLinkedList {

    static Node mergeUtil(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node last1 = head1.prev; // Last node of list1
        Node last2 = head2.prev; // Last node of list2

        Node lastNode;
        if (head1.data < head2.data) {
            lastNode = last2;
        } else {
            lastNode = last1;
        }

        last1.next = last2.next = null;

        Node finalHead = mergeSorted(head1, head2);

        finalHead.prev = lastNode;
        lastNode.next = finalHead;

        return finalHead;
    }

    static Node mergeSorted(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1.prev = tail;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2.prev = tail;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
            head1.prev = tail;
        }

        if (head2 != null) {
            tail.next = head2;
            head2.prev = tail;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.prev = head1;
        head1.next.next = new Node(5);
        head1.next.next.prev = head1.next;
        head1.next.next.next = head1;

        head1.prev = head1.next.next;

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.prev = head2;
        head2.next.next = new Node(6);
        head2.next.next.prev = head2.next;
        head2.next.next.next = head2;

        head2.prev = head2.next.next;

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        Node mergedHead = mergeUtil(head1, head2);

        System.out.println("Merged List:");
        printList(mergedHead);
    }
}
