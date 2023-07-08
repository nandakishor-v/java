import java.util.*;

public class StrobogrammaticNumber {
    static boolean isStrobogrammatic(String num) {
        Map<Character, Character> strobogrammaticDigits = new HashMap<>();
        strobogrammaticDigits.put('0', '0');
        strobogrammaticDigits.put('1', '1');
        strobogrammaticDigits.put('6', '9');
        strobogrammaticDigits.put('8', '8');
        strobogrammaticDigits.put('9', '6');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char c1 = num.charAt(left);
            char c2 = num.charAt(right);

            if (!strobogrammaticDigits.containsKey(c1) || strobogrammaticDigits.get(c1) != c2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        boolean isStrobogrammatic = isStrobogrammatic(num);

        System.out.println(num + " is" + (isStrobogrammatic ? "" : " not") + " a strobogrammatic number.");
    }
}
