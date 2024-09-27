class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;  
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Unable to push " + value);
        } else {
            stackArray[++top] = value;  
            System.out.println("Pushed " + value);
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Unable to pop.");
            return -1;  
        } else {
            int value = stackArray[top--];  // Return the top element and decrement top
            System.out.println("Popped " + value);
            return value;
        }
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        } else {
            System.out.println("Peeked " + stackArray[top]);
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return (top == -1);  
    }
    public boolean isFull() {
        return (top == maxSize - 1);  
    }
}
class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.peek();
        stack.push(40);
        stack.push(50);
        stack.push(60);  
    }
}
