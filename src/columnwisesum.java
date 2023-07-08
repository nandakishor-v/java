import java.util.Scanner;

public class columnwisesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the array:");

        // Input the array elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] columnSum = new int[col];
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                columnSum[j] += arr[i][j];
            }
        }

        System.out.println("Column-wise sums:");
        for (int i = 0; i < col; i++) {
            System.out.println("Column " + (i + 1) + ": " + columnSum[i]);
        }
    }
}
