import java.util.Scanner;

public class gcd {

          public static int CalculateGCD(int a, int b) {
                    while(b!=0){
                              int reminder = a%b;
                              a=b;
                              b=reminder;
                    }
                    return a;                 
          }
          public static int ArrayGCD(int arr[]) {

                    int res =arr[0];

                    for (int i = 0; i < arr.length; i++) {
                           res=   CalculateGCD(res, arr[i]);
                              
                    }  
                    return res;                  
          }
          public static void main(String[] args) {
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter the size of array");
                    int num = sc.nextInt();
                    int[] arr = new int[num];
                    System.out.println("Enter the elemnts");
                    for (int i = 0; i < arr.length; i++) {
                              
                              arr[i]=sc.nextInt();
                    }

                   int gcd = ArrayGCD(arr);
                   System.out.println("GCD of the elements: "+gcd);
          }
}
