public class decimaltobinary {
          public static void main(String[] args) {
                    int decimal = 10;
                    // int[]binary =new int[20];
                    // int index =0;
                    // if(decimal>0){
                    //           binary[index++]=decimal%2;
                    //           decimal=decimal/2;
                    // }

                    // for (int i = index-1; i >=0; i--) {
                    //           System.out.println(binary[i]);
                              
                    // }
                    String binary = Integer.toBinaryString(decimal);
                    System.out.println(binary);
                    
          }
}
