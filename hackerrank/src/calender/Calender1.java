package calender;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;


public class Calender1 {

	public static void main(String[] args) {
 Scanner sc1= new Scanner(System.in);
// String month=sc1.next();
 System.out.println("enter the date");
 int day=sc1.nextInt();
 System.out.println("enter the month");
 int mm=sc1.nextInt();
 System.out.println("enter the year");
 int yy=sc1.nextInt();

 LocalDate dt=LocalDate.of(yy, mm, day);
 System.out.println(dt.getDayOfWeek());
 

 
	}

	 

}
