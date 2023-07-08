
import java.util.*;
public class swapcontent {
              public static void main(String args[])
              {
                  Scanner sc = new Scanner(System.in); 
                  System.out.print("Enter the number of elements in the array: "); 
                  int num = sc.nextInt(); 
                  int arr[] = new int[num]; 
                  System.out.print("Enter the elements: "); 
                  for (int i = 0; i < num; i++) 
                  { 
                      arr[i] = sc.nextInt(); 
                  }
                  
                  System.out.println("The array elements are : "+Arrays.toString(arr));
          
                 int startIndex = 0, lastIndex = arr.length - 1, middleIndex = arr.length/2;

                 int[]firsthalf = Arrays.copyOfRange(arr, startIndex, middleIndex);
                 int[]secondhalf =Arrays.copyOfRange(arr, middleIndex, lastIndex);

                 Arrays.sort(firsthalf);
                 Arrays.sort(secondhalf);

                 for (int i = 0; i < secondhalf.length; i++) {

                    
                 }

                 


           
              }
          }  

