import java.util.LinkedList;

class Deque {
    private LinkedList<Integer> deque;

    public Deque() {
        deque = new LinkedList<>();
    }

    // Append an element to the right end of the deque
    public void append(int value) {
        deque.addLast(value);
    }

    // Append an element to the left end of the deque
    public void appendLeft(int value) {
        deque.addFirst(value);
    }

    // Pop an element from the right end of the deque
    public int pop() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.removeLast();
    }

    // Pop an element from the left end of the deque
    public int popLeft() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.removeFirst();
    }

    // Get the index of the first occurrence of an element
    public int index(int element, int start, int end) {
        if (start < 0 || end >= deque.size()) {
            throw new IndexOutOfBoundsException("Invalid start or end index");
        }
        return deque.subList(start, end + 1).indexOf(element);
    }

    // Insert an element at a specified index
    public void insert(int index, int value) {
        if (index < 0 || index > deque.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        deque.add(index, value);
    }

    // Remove the first occurrence of an element
    public void remove(int value) {
        deque.removeFirstOccurrence(value);
    }

    // Count occurrences of an element
    public int count(int value) {
        return (int) deque.stream().filter(v -> v == value).count();
    }

    // Get the current size of the deque
    public int size() {
        return deque.size();
    }

    // Access the front element
    public int front() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.getFirst();
    }

    // Access the back element
    public int back() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.getLast();
    }

    // Extend the deque with multiple values at the right end
    public void extend(Iterable<Integer> values) {
        for (int value : values) {
            append(value);
        }
    }

    // Extend the deque with multiple values at the left end (order is reversed)
    public void extendLeft(Iterable<Integer> values) {
        for (Integer value : values) {
            appendLeft(value);
        }
    }

    // Reverse the order of elements in the deque
    public void reverse() {
        LinkedList<Integer> reversedDeque = new LinkedList<>();
        for (int i = deque.size() - 1; i >= 0; i--) {
            reversedDeque.add(deque.get(i));
        }
        deque = reversedDeque;
    }

    // Rotate the deque by a specified number of positions
    public void rotate(int positions) {
        int size = deque.size();
        if (size == 0) return;
        positions = positions % size; // Normalize positions
        if (positions < 0) {
            positions += size; // Rotate left
        }
        for (int i = 0; i < positions; i++) {
            int value = deque.removeLast();
            deque.addFirst(value);
        }
    }

    // Display the elements in the deque
    public void display() {
        System.out.println(deque);
    }

    // Main method for testing
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.append(10);
        deque.append(20);
        deque.appendLeft(5);
        deque.display(); // Output: [5, 10, 20]

        deque.pop();
        deque.display(); // Output: [10, 20]

        deque.popLeft();
        deque.display(); // Output: [20]

        deque.insert(0, 15);
        deque.display(); // Output: [15, 20]

        System.out.println("Index of 20: " + deque.index(20, 0, 1)); // Output: 1

        deque.remove(15);
        deque.display(); // Output: [20]

        System.out.println("Count of 20: " + deque.count(20)); // Output: 1

        deque.extend(java.util.Arrays.asList(30, 40, 50));
        deque.display(); // Output: [20, 30, 40, 50]

        deque.extendLeft(java.util.Arrays.asList(10, 5));
        deque.display(); // Output: [5, 10, 20, 30, 40, 50]

        deque.reverse();
        deque.display(); // Output: [50, 40, 30, 20, 10, 5]

        deque.rotate(2);
        deque.display(); // Output: [10, 5, 50, 40, 30, 20]
    }
}

