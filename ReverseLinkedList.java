import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // Previous node starts as null
        ListNode current = head; // Start with the head of the list

        while (current != null) {
            ListNode next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to the next node
        }

        return prev; // Prev will be the new head of the reversed list
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverseLinkedList reverser = new ReverseLinkedList();

        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt(); // Read the number of nodes

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter the values for the linked list:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt(); // Read the value for each node
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode; // If it's the first node
                tail = newNode; // Set tail to the first node
            } else {
                tail.next = newNode; // Link new node to the last node
                tail = newNode; // Move tail to the new node
            }
        }

        ListNode result = reverser.reverseList(head); // Reverse the linked list
        System.out.print("Reversed linked list: ");
        printList(result); // Print the reversed linked list

        scanner.close(); // Close the scanner
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        if (current == null) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null) {
            sb.append(current.val);
            current = current.next;
            if (current != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
