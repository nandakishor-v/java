import java.util.Scanner;

public class stack {
          class Node{
                    int data;
                    Node next;

                    public Node(int data){
                              this.data=data;
                              this.next=null;
                    }
          }

          public Node top = null;
          
          public  void push(int data) {
                    Node newNode = new Node(data);
                    if(top == null){
                           top = newNode;

                    }
                    else{
                              newNode.next=top;
                              top = newNode;
                    }
                    
          }

          public void pop(){
                    if(top == null){
                              System.out.println("stack is empty");
                    }
                    else{
                    top =top.next;}
          }

          public void peek(){
                    System.out.println(top.data);
          }

          public void isempty(){
                    if(top == null){
                              System.out.println("stack is empty");
                    }else{
                              System.out.println("stack is not empty");
                    }
          }
          void display() {
                    Node current = top;
                    if (current != null) {
                        System.out.print(current.data+" " );
                        current = current.next;
                    }
                    else{
                              System.out.println("empty stack");
                    }
                }
                    public static void main(String[] args) {
                              stack stack = new stack();
                              while (true){

                              
                              try (Scanner src = new Scanner(System.in)) {
                                        System.out.println("enter the operation");
                                        System.out.println("push = 1 "+"pop = 2 "+"peek = 3 "+"isempty = 4 "+"exit = 5 "+"display = 6 ");
                                        System.out.println();
                                        int num = src.nextInt();

                                        switch(num){
                                                  case 1:
                                                  System.out.println(" enter the data");
                                                  stack.push(src.nextInt());
                                                  break;
                                        
                                                  case 2:
                                                  stack.pop();
                                                  break;

                                                  case 3:
                                                  stack.peek();
                                                  break;

                                                  case 4 :
                                                  stack.isempty();
                                                  break;

                                                  case 5:
                                                  System.out.println("exit");
                                                  break;

                                                  case 6:
                                                  stack.display();
                                                  System.out.println();
                                        }
                                        if(num==5){
                                                  break;
                                        }
                              }


                              
                    }
                              
                    }          
}
