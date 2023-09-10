import java.util.Arrays;
import java.util.Scanner;

class target_sum {
    static int[] targetSum(int[] a, int target) {
        Arrays.sort(a); 

        int left = 0, right = a.length -1, tempSum;
        while (left < right) {
            tempSum = a[left] + a[right];
            if (tempSum == target)
                return new int[]{left , right };
            if (tempSum > target)
                right--;
            else
                left++;
        }
        return new int[]{-1, -1};
    }

    public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("size");
          int num = sc.nextInt();
          int arr[]=new int[num];
          System.out.println("element");
          for (int i = 0; i < arr.length; i++) {
                    arr[i]=sc.nextInt();
                    
          }

        int target = 6;
        for (int x : targetSum(arr, target))
            System.out.print(x + " ");
    }
}
