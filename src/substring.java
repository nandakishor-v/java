import java.util.Scanner;

public class substring {
          public static void main(String[] args) {
                    Scanner src =new Scanner(System.in);

                    System.out.println("Enter the first string ");
                     String str1 = src.nextLine();
                     System.out.println();

                     System.out.println("Enter string 2");
                     String str2 =src.nextLine();

                     System.out.println();
          
                    // String str1 = "Tiger";
                    // String str2 ="ger";
                    if (str1.contains(str2)){
                              String str3 = str1.replace(str2,"");
                              System.out.println(str3);
                    }
                    else if(str2.contains(str1)){

                              String str3 = str2.replace(str1, "");
                              System.out.println(str3);

                    }
                    else{
                              System.out.println("Not a sub string");
                    }

                    src.close();

          }
          
}
