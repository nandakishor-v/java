import java.util.*;;
public class tcs {
          public static void main(String[] args) {
                              Scanner src = new Scanner(System.in);
                              System.out.println("Enter the lower limit");
                              int low = src.nextInt();

                              System.out.println("Enter the upper limit");
                              int high =src.nextInt();
                              System.out.println();

                              
                              for (int i = low; i <= high; i++) {
                                        if(Integer.toString(high).length()> Integer.toString(low).length()){
                                                  int zero =Integer.toString(high).length() - Integer.toString(i).length();
                                                  String str ="";

                                                  for( int j =0 ; j< zero;j++){
                                                            str = str + "0";
                                                  }
                                                  System.out.println(str + i +" ");
                                        
                                        }

                                        else {
                                                  System.out.println(i);
                                        }


                                      //  System.out.print(i+" ");
                                        
                              }


          }

          
}
