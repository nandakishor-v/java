import java.lang.reflect.Array;
import java.util.*;
public class array {
          public static void main(String[] args) {
                    int[] arr = {10,40,30,20,50,100};
                    Arrays.sort(arr);

                    for (int i = 0; i < arr.length; i=+2) {
                              System.out.print(arr[i]+" ");        
                    }

          }    
}
