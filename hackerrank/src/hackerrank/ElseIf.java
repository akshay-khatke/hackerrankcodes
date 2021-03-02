package hackerrank;

import java.util.Scanner;

public class ElseIf {
	

	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
int t=sc1.nextInt();
		for(int i=0;i<t;i++)
	    {

	        try
	        {
	    		long num=sc1.nextLong();
	    		
	   		 System.out.println(num+" can be fittted in:");


		  if(num>=-128&&num<=127) {
				
				System.out.println("*byte");
			}
			 if(num>=-32768&&num<=32767) {
				System.out.println("*short");
			}
			 if(num>=-2147483648 &&num<=2147483647) {
				 System.out.println("*int");
}
			 
			 if(num>=-9223372036854775808l&&num<=9223372036854775807l) {
					System.out.println("*long");

				  }

	        }catch(Exception e) {
	        	
	        	System.out.println(sc1.next()+" can't be fitted anywhere.");
	      
	              }
	        

    
	       }

  }
}