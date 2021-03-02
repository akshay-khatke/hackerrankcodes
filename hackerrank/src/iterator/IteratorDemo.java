package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList arr=new ArrayList<>();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter hash");
		
		
	

		arr.add("string");
		arr.add("hello java");
		Iterator it=arr.iterator();
		while(it.hasNext()) {
			Object o=it.next();	
		if(o instanceof String)	{
			System.out.println(o);
		break;
			
		}
		
		}
		
		
		
	}

}
