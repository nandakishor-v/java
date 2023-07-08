import java.util.*;
public class palindrom {
     
          public static void main(String[] args) {
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter the number ");
                       int n = sc.nextInt();
                       int revnum=0, reminder ,original,sum;

                       for ( sum = 0; n !=0; n=n/10) {
                              
                              sum +=n/10;
                       }

                       original=sum;
                          while(sum!=0){
                              reminder=sum%10;
                              revnum = revnum*10+reminder;
                              sum/=10;

                          }

                          if(original==revnum){
                              System.out.println("sum is palindrome ");

                          }
                          else{
                              System.out.println("not a palindrome ");
                          }



          }

}
