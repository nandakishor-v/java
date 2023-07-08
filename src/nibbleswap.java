
import java.util.*;

public class nibbleswap{
          public static int swap(int n) {

                    int right = (n & 0b00001111);
                    right=right<<4;

                    int left =(n&0b11110000);
                    left = left>>4;

                    return(left|right);
                   
              
          }
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number");
                    int n =sc.nextInt();
                 int nibbleswaped =   swap(n);
                 System.out.println("after swapping "+n+" = "+nibbleswaped);
                    
          }
}