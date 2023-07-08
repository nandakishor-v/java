
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    void rotate(int k) {
        if (head == null || head.next == null || k == 0) {
            return;
        }

        int length = 1;
        Node tail = head;

        // Find the length of the linked list and the last node
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Adjust k to be within the length of the linked list
        k = k % length;
        if (k == 0) {
            return; // No rotation needed
        }

        // Find the new head and tail nodes after rotation
        int stepsToNewHead = length - k;
        Node newHead = head;
        Node newTail = null;

        // Traverse to the new head and update pointers
        for (int i = 0; i < stepsToNewHead; i++) {
            newTail = newHead;
            newHead = newHead.next;
        }

        // Perform rotation
        tail.next = head;
        newTail.next = null;
        head = newHead;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class rotatekplaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        // Appending elements to the linked list
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        System.out.print("Original linked list: ");
        linkedList.display();
        
        System.out.println("Number of shift ");

        int k = sc.nextInt(); // Number of places to rotate the linked list
        linkedList.rotate(k);

        System.out.print("Rotated linked list by " + k + " places: ");
        linkedList.display();
    }
}
