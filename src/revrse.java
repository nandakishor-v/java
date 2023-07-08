import java.util.*;

public class revrse {
    public static void main(String[] args) {

     Scanner src = new Scanner(System.in);
     
     System.out.println("Enter any three digit number");
     
     int n = src.nextInt(),
     
     n1,n2,n3,reverse=0;
     n1=n%10;
     n=n/10;
     reverse=reverse*10 + n1;
     
     n2=n%10;
     n=n/10;
     reverse=reverse*10 + n2;
     
     n3=n%10;
     n=n/10;
     reverse=reverse*10 +n3;
     
     System.out.println(reverse);
     src.close();
    }
    
}
