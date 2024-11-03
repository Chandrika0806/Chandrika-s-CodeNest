import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Add an element to the end of the queue
    public void push(int x) {
        stack1.push(x);
    }

    // Remove the element from the front of the queue
    public int pop() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 only if stack2 is empty
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Get the front element of the queue
    public int peek() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 if stack2 is empty
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Main method to test the queue implementation
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Removed element: " + queue.pop());
        System.out.println("Front element after pop: " + queue.peek());
        System.out.println("Is queue empty? " + queue.empty());

        queue.push(40);
        System.out.println("Front element after pushing 40: " + queue.peek());
    }
}

