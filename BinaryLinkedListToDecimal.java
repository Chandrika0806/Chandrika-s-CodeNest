import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class BinaryLinkedListToDecimal {
    
    // Function to convert binary linked list to decimal value
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        ListNode current = head;

        // Traverse the linked list
        while (current != null) {
            // Shift left by 1 (multiply by 2) and add the current node value
            decimalValue = (decimalValue << 1) | current.val;
            current = current.next;
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryLinkedListToDecimal converter = new BinaryLinkedListToDecimal();

        // Prompt user to enter the number of nodes in the linked list
        System.out.print("Enter the number of nodes in the linked list (0s and 1s only): ");
        int n = scanner.nextInt(); // Read the number of nodes

        ListNode head = null; // Head of the linked list
        ListNode tail = null; // Tail of the linked list

        // Prompt user to enter the values for the linked list
        System.out.println("Enter the values for the linked list (0 or 1):");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt(); // Read the value for each node
            if (value != 0 && value != 1) {
                System.out.println("Invalid input! Please enter only 0 or 1.");
                return; // Exit if input is invalid
            }
            ListNode newNode = new ListNode(value); // Create a new node
            if (head == null) {
                head = newNode; // If it's the first node, set as head
                tail = newNode; // Also set tail to the first node
            } else {
                tail.next = newNode; // Link the new node to the last node
                tail = newNode; // Move tail to the new node
            }
        }

        // Convert binary linked list to decimal value
        int decimalValue = converter.getDecimalValue(head);
        System.out.println("The decimal value of the binary linked list is: " + decimalValue);

        scanner.close(); // Close the scanner
    }
}
