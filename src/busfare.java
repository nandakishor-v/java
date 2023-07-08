import java.util.Scanner;

class CircularQueue {
    private int front, rear;
    private final int MAX_SIZE = 100;
    private final int[] queue = new int[MAX_SIZE];

    public CircularQueue() {
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % MAX_SIZE == front;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add element.");
        } else if (isEmpty()) {
            front = rear = 0;
            queue[rear] = element;
        } else {
            rear = (rear + 1) % MAX_SIZE;
            queue[rear] = element;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        } else if (front == rear) {
            int element = queue[front];
            front = rear = -1;
            return element;
        } else {
            int element = queue[front];
            front = (front + 1) % MAX_SIZE;
            return element;
        }
    }

    public int getSize() {
        if (isEmpty()) {
            return 0;
        } else if (front <= rear) {
            return rear - front + 1;
        } else {
            return (MAX_SIZE - front) + (rear + 1);
        }
    }
}

public class busfare {
    public static void main(String[] args) {
        CircularQueue busQueue = new CircularQueue();
        int totalFare = 0; // Total fare
        int farePerKm = 5; // Fare per km after the initial 20 km

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the total number of kilometers the bus will travel: ");
            int totalKm = scanner.nextInt();

            // Enqueue all the kilometers
            for (int km = 1; km <= totalKm; km++) {
                busQueue.enqueue(km);
            }
        }
        while (!busQueue.isEmpty()) {
            int km = busQueue.dequeue();
            if (km <= 20) {
                totalFare += 20;
            } else {
                totalFare += farePerKm;
            }
            System.out.println("Passenger at kilometer " + km + " pays Rs. " + totalFare);
        }
    }
}
