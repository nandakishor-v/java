import java.util.Arrays;
import java.util.Scanner;

public class sortfirsthalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int middleIndex = arr.length / 2;

        Arrays.sort(arr, 0, middleIndex);
        Arrays.sort(arr,middleIndex,arr.length);


        for (int i = middleIndex; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                int   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }  
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
}
