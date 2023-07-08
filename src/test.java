class Node {
          int data;
          Node next;
      
          Node(int data) {
              this.data = data;
              this.next = null;
          }
      }
      
      class LinkedList {
          Node head;
      
          void append(int data) {
              Node newNode = new Node(data);
              if (head == null) {
                  head = newNode;
              } else {
                  Node current = head;
                  while (current.next != null) {
                      current = current.next;
                  }
                  current.next = newNode;
              }
          }
      
          void deleteNodes(int m, int n) {
              if (head == null) {
                  return;
              }
      
              Node current = head;
              int count;
      
              while (current != null) {
                  for (count = 1; count < m && current != null; count++) {
                      current = current.next;
                  }
      
                  if (current == null) {
                      return;
                  }
      
                  Node temp = current.next;
                  for (count = 1; count <= n && temp != null; count++) {
                      temp = temp.next;
                  }
      
                  current.next = temp;
                  current = temp;
              }
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
      
      public class test {
          public static void main(String[] args) {
              LinkedList linkedList = new LinkedList();
              linkedList.append(1);
              linkedList.append(2);
              linkedList.append(3);
              linkedList.append(4);
              linkedList.append(5);
              linkedList.append(6);
              linkedList.append(7);
              linkedList.append(8);
              linkedList.append(9);
              linkedList.append(10);
      
              int m = 2; // Number of nodes to skip
              int n = 3; // Number of nodes to delete after skipping
      
              System.out.println("Original Linked List:");
              linkedList.display();
      
              linkedList.deleteNodes(m, n);
      
              System.out.println("\nAfter deleting " + n + " nodes after every " + m + " nodes:");
              linkedList.display();
          }
      }
      