import java.util.Scanner;

public class LinearQueue {
    static final int MAX = 5; // Maximum size of the queue
    static int[] queue = new int[MAX];
    static int front = 0;
    static int rear = 0;

    // Check if the queue is empty
    public static boolean isEmpty() {
        return front == rear;
    }

    // Check if the queue is full
    public static boolean isFull() {
        return rear == MAX;
    }

    // Add an item to the queue
    public static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
        } else {
            queue[rear] = item;
            rear++;
            System.out.println("Enqueued " + item);
        }
    }

    // Remove an item from the queue
    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
        } else {
            System.out.println("Dequeued " + queue[front]);
            // Shift elements to the left after dequeue
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
    }

    // Display the queue
    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to interact with the queue
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to enqueue: ");
                    int item = scanner.nextInt();
                    enqueue(item);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
