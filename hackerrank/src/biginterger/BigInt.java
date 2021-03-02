package biginterger;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BigInt {
	
	
	



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	      String s=scanner.nextLine();

         BigInteger b=new BigInteger(s);
         boolean flag=b.isProbablePrime(1);
         
	        if(flag){
	            System.out.println("Prime");
	            
	        }else{
	            System.out.println("Not Prime");
	        }
	        scanner.close();

	    }
}
