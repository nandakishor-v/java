import java.util.Scanner;

public class automorphic {
    public static boolean isAutomorphicNumber(int a) {
        int square = a * a;

        while(a > 0) {
            if(a%10 != square%10)
            return false;

            a = a/10;
            square = square/10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        if (isAutomorphicNumber(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
        scanner.close();
    }
    
 }
