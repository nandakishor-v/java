import java.util.Scanner;

public class pal {
    public static void printPalindromeString(String str) {
        StringBuilder palindrome = new StringBuilder(str);
        palindrome.append(new StringBuilder(str).reverse());
        System.out.println("Extra added string: " + palindrome.substring(str.length()));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Enter a string: ");
                  String input = scanner.nextLine();
          
                  printPalindromeString(input);
}
    }
}
