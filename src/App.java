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

    void deleteFirst() {
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else {
            head = head.next;
        }
    }

    void deleteLast(){
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }
    

    void deleteparticularpos(int position){
    if(head==null)
    return;
    Node temp = head;

    if(position ==0){
        head=temp.next;
        return;
    }

    for(int i=0;temp!=null && i<position-1;i++)
    temp =temp.next;
    if (temp == null || temp.next == null)
    return;
Node next = temp.next.next;

temp.next = next;  
}

void minMax(Node head){
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    Node temp = head;
    while(temp!=null){
        if(temp.data<min){
            min =temp.data;
        }
        else if(temp.data>max){
            max= temp.data;
        }
        temp =temp.next;

    }
    System.out.println("min is "+ min);
    System.out.println("max value is " + max);
}
        
        
    

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data+" " );
            current = current.next;
        }   
    }

    void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public void findIndex(int a) {
        Node temp = head;
        int index = 0;
        boolean found = false;

        while(temp != null) {
            if(a ==  temp.data) {
                System.out.println("The index is " + index);
                found = true;
                break;
            }
            ++index;
            temp = temp.next;
        }

        if(!found) {
            System.out.println("The number is not present in the linkedlist");
        }
        
    }
    
    
    public int findNearestPrime(int n) {
        for (int i = n; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 2;
    }
    
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    void deletealternative(){
        
            if (head == null) {
                System.out.println("Linked list is empty.");
                return;
            }
        
            Node current = head;
            while (current != null && current.next != null) {
                current.next = current.next.next;
                current = current.next;
            }
        }
        
    
    
    void middlenode(){
            if (head == null) {
                System.out.println("Linked list is empty.");
                return;
            }
        
            Node slow = head;
            Node fast = head;
        
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        
            System.out.println("Middle node value: " + slow.data);
        }
        void swapPairwise() {
            Node current = head;
            while (current != null && current.next != null) {
                int temp = current.data;
                current.data = current.next.data;
                current.next.data = temp;
                current = current.next.next;
            }
        }
        
    }
    


public class App {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

       linkedList.insert(6);
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        System.out.println("Linked List before deletion:");
        linkedList.display();
        System.out.println();
    //     System.out.println();
    //     System.out.println();

    //     linkedList.deleteFirst();

    //     System.out.println("Linked List after deletion:");
    //     linkedList.display();
    //     System.out.println();
    //     System.out.println();

    //     System.out.println("linked list after deleting the last");
    //     linkedList.deleteLast();
    //     linkedList.display();
    //     System.out.println();
    //     System.out.println();

    //    System.out.println("linked list deleting at a particular pos");
    //     linkedList.deleteparticularpos(1);
    //     linkedList.display();
    //     System.out.println();
    //     System.out.println();

    //     linkedList.reverse();
    //     linkedList.display();

      //  linkedList.minMax(linkedList.head);

    //   linkedList.findIndex(4);

    linkedList.swapPairwise();
    linkedList.display();

    //   linkedList.middlenode();
    //   System.out.println();

    //   linkedList.deletealternative();
    //   linkedList.display();
      
    
        
    }
}
 