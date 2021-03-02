package regularexppattern;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static boolean matchingPair(char open,char close) {  
		
		if(open=='('&& close==')') {
			return true;
		}
		else if(open=='['&& close==']') {
			return true;
		}
		return open=='{'&&close=='}';
		

}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
            char []input=pattern.toCharArray();
            Stack<Character> stack=new Stack<>();
            for(char c:input) {
            	
          if(c=='('||c=='{'||c=='[') {
        	  stack.push(c);
          }
          else if(c=='}'||c==']'||c==')') {
        	  if(matchingPair(stack.peek(), c)) {
        		  stack.pop();
        	  }
        	  else if(stack.empty()) {
        		  System.out.println("invalid");
        	  }else {
            	  System.out.println("invalid");
              }
               
        	  
          } 	
            	
            	
            }
			
			if(stack.empty()) {
				System.out.println("valid");
				
			}else {
				System.out.println("invalid");
			}
			
		}
	}

}
