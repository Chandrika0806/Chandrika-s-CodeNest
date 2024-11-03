import java.util.Scanner;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class PalindromeLinkedList {

    // Function to check if the linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node list is a palindrome
        }

        Stack<Integer> stack = new Stack<>();
        ListNode current = head;

        // Push all values onto the stack
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        current = head;

        // Compare values with those popped from the stack
        while (current != null) {
            if (current.val != stack.pop()) {
                return false; // Mismatch found
            }
            current = current.next;
        }

        return true; // No mismatches, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeLinkedList palindromeChecker = new PalindromeLinkedList();

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

        boolean result = palindromeChecker.isPalindrome(head); // Check for palindrome
        System.out.println("Is the linked list a palindrome? " + result);

        scanner.close(); // Close the scanner
    }
}
