class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to simplify edge cases (like removing the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy; // Start from the dummy node

        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the target value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return dummy.next; // Return the new head, which is the next of dummy
    }

    public static void main(String[] args) {
        RemoveLinkedListElements remover = new RemoveLinkedListElements();

        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next.next = new ListNode(6);

        ListNode result1 = remover.removeElements(head1, 6);
        printList(result1); // Output: 1 -> 2 -> 3 -> 4 -> 5

        // Example 2
        ListNode head2 = null; // Empty list
        ListNode result2 = remover.removeElements(head2, 1);
        printList(result2); // Output: (empty list)

        // Example 3
        ListNode head3 = new ListNode(7);
        head3.next = new ListNode(7);
        head3.next.next = new ListNode(7);
        head3.next.next.next = new ListNode(7);

        ListNode result3 = remover.removeElements(head3, 7);
        printList(result3); // Output: (empty list)
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
