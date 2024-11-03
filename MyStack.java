import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push element onto the stack
    public void push(int x) {
        // Add to queue2 first
        queue2.add(x);
        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Remove the element on top of the stack
    public int pop() {
        return queue1.remove();
    }

    // Get the top element of the stack
    public int top() {
        return queue1.peek();
    }

    // Check if the stack is empty
    public boolean empty() {
        return queue1.isEmpty();
    }

    // Main method for testing the stack implementation
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.top());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.top());
        System.out.println("Is stack empty? " + stack.empty());

        stack.push(40);
        System.out.println("Top element after pushing 40: " + stack.top());
    }
}
