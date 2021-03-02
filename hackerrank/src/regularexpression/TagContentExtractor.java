package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in);
		int tc=Integer.parseInt(sc1.nextLine());
		
		while(tc>0) {
			String s=sc1.nextLine();
			
			String regx="<(.+)>([^<]+)</\\1>";
			boolean isFound=false;
			Pattern p=Pattern.compile(regx);
			Matcher m=p.matcher(s);
			
			while(m.find()) {
				System.out.println(m.group(2));
			isFound=true;
			
			}
			if(!isFound) {
				System.out.println("None");
			}
			tc--;
		}
		
		
		
	}

}
