package staticblockinitliser;

import java.util.Scanner;

public class BlockInit {
static Scanner sc1=new Scanner(System.in);
static int B=sc1.nextInt();
static int H=sc1.nextInt();
static boolean flag=false;


	static  {
		try {
		if(B<=0||H<=0) {
			throw new Exception("Breadth and height must be positive");
		}else {
			flag=true;
		}
	}
catch(Exception e) {
	System.out.println(e);
}
	}
		public static void main(String[] args) {
		
			if(flag) {
				int area=B*H;
				System.out.println(area);
			}
	}

}
