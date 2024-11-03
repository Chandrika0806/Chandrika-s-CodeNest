import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MiddleOfLinkedList {

    // Function to find the middle node of the linked list
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer twice as fast as slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move slow pointer by one
            fast = fast.next.next; // Move fast pointer by two
        }

        return slow; // slow is now at the middle node
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiddleOfLinkedList middleFinder = new MiddleOfLinkedList();

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

        ListNode middleNode = middleFinder.middleNode(head); // Find the middle node
        System.out.print("The middle node(s) of the linked list: ");
        while (middleNode != null) {
            System.out.print(middleNode.val + " ");
            middleNode = middleNode.next; // Print from the middle to the end
        }
        System.out.println(); // New line for output

        scanner.close(); // Close the scanner
    }
}
