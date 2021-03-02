package endoffile;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {

		Scanner sc1= new Scanner(System.in);
		int i=0;
		while(sc1.hasNext()) {
			++i;
			System.out.println(i+" "+sc1.nextLine());
			
		}
		
		
		
		
		
	}

}
