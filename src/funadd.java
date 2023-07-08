import java.util.*;
public class funadd {
          public static void printArray(int[] arr) {
              int largestEven = Integer.MIN_VALUE;
              int secondLargestEven = Integer.MIN_VALUE;
              int largestOdd = Integer.MIN_VALUE;
              int secondLargestOdd = Integer.MIN_VALUE;
              int sum = 0;
      
              for (int i = 0; i < arr.length; i++) {
                  if (i % 2 == 0) {
                      if (arr[i] > largestEven) {
                          secondLargestEven = largestEven;
                          largestEven = arr[i];
                      } else if (arr[i] > secondLargestEven && arr[i] < largestEven) {
                          secondLargestEven = arr[i];
                      }
                  } else {
                      if (arr[i] > largestOdd) {
                          secondLargestOdd = largestOdd;
                          largestOdd = arr[i];
                      } else if (arr[i] > secondLargestOdd && arr[i] < largestOdd) {
                          secondLargestOdd = arr[i];
                      }
                  }
              }
      
              System.out.println("Second Largest Even: " + secondLargestEven);
              System.out.println("Second Largest Odd: " + secondLargestOdd);

              sum = secondLargestEven+secondLargestOdd;
              System.out.println("sum is "+sum);
          }
      
          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
            
                    int[] numbers = new int[n];
                    System.out.println("Enter the array elements:");
                    for (int i = 0; i < n; i++) {
                        numbers[i] = scanner.nextInt();
                    }
            
                    scanner.close();
            
                    printArray(numbers);
                }
            }
      
      