public class funstring {

          public static int simplify(String s){
               int result = s.charAt(0)-'0';
               
               for (int i = 1; i < s.length()-1; i++) {
                    char ch = s.charAt(i);
                    
                    if (ch == 'A') {
                         result = result & (s.charAt(i+1)-'0');
                    } else if (ch == 'B') {
                         result = result | (s.charAt(i+1)-'0');
                    } else if (ch == 'C') {
                         result = result ^ (s.charAt(i+1)-'0');
                    }
               }
          
               return result;
}
     
          public static void main(String[] args) {
               String s = "1C0C1A0B1";
               int result = simplify(s);
               System.out.println("Result: " + result);
          }
     }
     