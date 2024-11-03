class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false; // Empty list has no cycle
        }

        ListNode slow = head; // Tortoise
        ListNode fast = head; // Hare

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move tortoise by one
            fast = fast.next.next; // Move hare by two

            // Check if the two pointers meet
            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }

    public static void main(String[] args) {
        LinkedListCycle cycleDetector = new LinkedListCycle();

        // Example 1: Creating a cycle
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next; // Create cycle here (pos = 1)

        System.out.println(cycleDetector.hasCycle(head1)); // Output: true

        // Example 2: Creating a cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = head2; // Create cycle here (pos = 0)

        System.out.println(cycleDetector.hasCycle(head2)); // Output: true

        // Example 3: No cycle
        ListNode head3 = new ListNode(1);
        System.out.println(cycleDetector.hasCycle(head3)); // Output: false
    }
}
