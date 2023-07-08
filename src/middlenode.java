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
      
          void insert(int data) {
              Node newNode = new Node(data);
              if (head == null) {
                  head = newNode;
              } else {
                  newNode.next = head;
                  head = newNode; 
              }
          }

          void display() {
                    Node current = head;
                    while (current != null) {
                        System.out.print(current.data+" " );
                        current = current.next;
                    }
                }


               class middlenode{
                public static void main(String[] args) {
                    LinkedList lk =new LinkedList();
                    lk.insert(19);
                    lk.insert(14);
                    lk.insert(16);
                    lk.insert(12);
                    lk.insert(11);
                    lk.insert(13);
                    lk.insert(17);

                    lk.display();
                }
          }
}