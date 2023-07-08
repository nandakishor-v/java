

class Node {
    int data;
    int priority;
    Node next;

    public Node(int data,int priority) {
        this.data = data;
        this.next = null;
        this.priority=priority;
    }
}

class LinkedList {
    Node head;

    void insert(int data, int priority) {
        Node newNode = new Node(data ,priority);
        if (head == null || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
          Node current = head;
          while (current.next != null && priority >= current.next.priority) {
              current = current.next;
          }
          newNode.next = current.next;
          current.next = newNode;

    }
}
int remove() {
          if (head == null) {
              throw new IllegalStateException("Priority queue is empty.");
          }
  
          int data = head.data;
          head = head.next;
          return data;
      }
  
      boolean isEmpty() {
          return head == null;
      }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class priorityQueue {
    public static void main(String[] args) {
        LinkedList priorLinkedList = new LinkedList();
        priorLinkedList.insert(13, 1);
        priorLinkedList.insert(14, 10);
        priorLinkedList.insert(16, 6);
        priorLinkedList.insert(17, 5);
        priorLinkedList.insert(19, 4);
    }
}
