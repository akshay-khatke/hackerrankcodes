package anagrams;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
		
		
		
		
		
public static void swap(char a,char b) {
	
}

		    static boolean isAnagram(String a, String b) {
		    	a=a.toLowerCase();
		    	b=b.toLowerCase();
		    	int []arr=new int[26];
		    	
			        for (int i = 0; i <a.length(); i++) {
			        
			        int index=a.charAt(i)-'a';//
			        System.out.print(index+" ");
			        
			        arr[index]++;
			        }
			        System.out.println();
			        for (int i = 0; i <b.length(); i++) {
				        
				        int index=b.charAt(i)-'a';
				        System.out.print(index+" ");
				        arr[index]--;
				        }    
			        for (int i = 0; i <arr.length; i++) {
				        if(arr[i]!=0) {
				        	return false;
				        }
				        }
			        return true;
		    }

		  public static void main(String[] args) {
		    
		        Scanner scan = new Scanner(System.in);
		        String a = scan.next();
		       String b = scan.next();
		        scan.close();
		        boolean ret = isAnagram(a, b);
		        
		       System.out.println(ret);
		       System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		    
		    
		       /*
		      for(int k=0;k<chars1.length;k++){
		      System.out.print(chars1[k]);
		      }
		      System.out.println();
		      for(int k=0;k<chars2.length;k++){
			      System.out.print(chars2[k]);
			      }*/
			      
		       
		      }
		  
		  
		  }	
	


