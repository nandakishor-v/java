import java.util.*;
public class symmetric {
          public static void main(String[] args) {
          
        int[] arr = {1, 2, 3, 4, 2, 1, 5,0,6};
        List<String> symmetricPairs = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    symmetricPairs.add("(" + i + ", " + j + ")");
                    symmetricPairs.add("(" + j + ", " + i + ")");
                }
            }
        }

          System.out.println(symmetricPairs);
        }
    }


