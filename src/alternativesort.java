import java.util.Arrays;
import java.util.Scanner;

public class alternativesort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the lenght ");
        int num = sc.nextInt();
        int[]array = new int[num];
        System.out.println("Enter the elements");
        for (int i = 0; i < array.length; i++) {
                array[i]=sc.nextInt(); 
        }
        System.out.println();


       // int[] array = {5,1,4,7,9};

        for (int i = 0; i < array.length; i += 2) {
            for (int j = i + 2; j < array.length; j += 2) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i+=2) {
          System.out.print(array[i]+" ");
            
        }
        
        
    }
    
}
