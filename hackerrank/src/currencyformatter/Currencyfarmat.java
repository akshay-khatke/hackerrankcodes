package currencyformatter;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class Currencyfarmat {
	 public static void main(String[] args) {
		// create a new locale  
	      Locale locale1 = new Locale("EN", "INDIA");  
	  
	      // print locale  
	      System.out.println("Locale: " + locale1);  
	  
	      // print language  
	      System.out.println("Language: " + locale1.getDisplayLanguage(locale1));  
	     
	      // print country   
	      System.out.println("Country Name: "  
	                                 + locale1.getDisplayCountry());  
	      System.out.println("country code : "+locale1.CANADA);
	        
	      // get a hash code and print it  
	      System.out.println("HashCode for this locale: " + locale1.hashCode());


	 }}
