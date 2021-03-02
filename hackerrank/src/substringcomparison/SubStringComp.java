package substringcomparison;

import java.util.Arrays;
import java.util.Scanner;

public class SubStringComp {
	static String smallest="";
static 	String largest="";
	public static String getSmallestAndLargest(String s,int k) {
		for(int i=0;i<s.length()-(k-1);i++) {
			
		
		String substr=s.substring(i,i+k);
		if(i==0) {
			smallest=substr;
		}
		if(substr.compareTo(smallest)<0) {
			smallest=substr;
		}
		else if(substr.compareTo(largest)>0) {
			largest=substr;
		}
		
		
		}
		return smallest+"\n"+largest;
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println( getSmallestAndLargest(s,k));
	}
	}
