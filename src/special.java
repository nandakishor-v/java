import java.util.Scanner;

public class special {
          public static void main(String[] args) {
                    try (Scanner scanner = new Scanner(System.in)) {
                              System.out.print("Enter the starting number: ");
                              int start = scanner.nextInt();
                              System.out.print("Enter the ending number: ");
                              int end = scanner.nextInt();
                              int sum = 0;
                              int pro = 1;

                              for(int num = start;num<=end;num++){
                                        int temp = num;
                                      if(num<99){
                                        sum =num%10+num/10;
                                        pro =(num%10)*(num/10);
                                      }

                              if(num >10 && sum + pro == temp){
                                        System.out.println("special "+num);
                              }

                              }
                    }
          }
          
          
}
