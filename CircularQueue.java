class CircularQueue {
    private int size;
    private int front, rear;
    private int[] queue;

    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // Enqueue an element into the circular queue
    public void enqueue(int data) {
        // Check if the queue is full
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full. Cannot enqueue " + data);
        } else {
            // If the queue is empty, set front to 0
            if (front == -1) {
                front = 0;
            }
            // Move rear to the next position in circular manner
            rear = (rear + 1) % size;
            queue[rear] = data;
            System.out.println("Enqueued " + data);
        }
    }

    // Dequeue an element from the circular queue
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int data = queue[front];
        // If the queue has only one element, reset it to empty
        if (front == rear) {
            front = rear = -1;
        } else {
            // Move front to the next position in circular manner
            front = (front + 1) % size;
        }
        System.out.println("Dequeued " + data);
        return data;
    }

    // Display the elements in the circular queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Main method to test the circular queue implementation
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(60);
        queue.display();
    }
}

