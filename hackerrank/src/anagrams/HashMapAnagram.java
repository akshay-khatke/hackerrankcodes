package anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAnagram {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Map<Character, Integer> map=new HashMap<>();
		String a=sc1.next();
		String b=sc1.next();
		
		for(int i=0;i<a.length();i++) {
			char letter=a.charAt(i);
			if(!map.containsKey(letter)) {
				map.put(letter, 1);
			}else {
				Integer freq=map.get(letter);
				map.put(letter, freq++);
			}
		}
		
		
		
		for(int k=0;k<b.length();k++) {
			char letter=b.charAt(k);
			
			
			
		
			Integer freq=map.get(letter);
			if(freq==0||!map.containsKey(letter)) {
				System.out.println("not anagram");

			}
			else  {
				map.put(letter, --freq);
				
			}
			
			
			System.out.println("anagram");
		}
		
	}

}
