import java.util.*;

public class postfix {
          	public static void main(String[] args)
                    {
                              String sr="123*+";
                              Stack<Integer> stack = new Stack<>();
                              for (int i = 0; i < sr.length(); i++) {
                                        char ch = sr.charAt(i);
                                        if(Character.isDigit(ch)){
                                           stack.push(ch - '0');
                                        }
                                        else{
                                                  int x = stack.pop();
                                                  int y = stack.pop();

                                                  switch(ch){
                                                            case '+':
                                                            stack.push(x + y);
                                                            break;

                                                             case '-':
                                                             stack.push(x - y);
                                                             break;

                                                             case '*':
                                                             stack.push(x * y);
                                                             break;

                                                             case '/':
                                                             stack.push(x/y);
                                                             break;
                                                  }
                                        }
                              }
                              System.out.println(stack);

                              

                    }}
	
		
		

		