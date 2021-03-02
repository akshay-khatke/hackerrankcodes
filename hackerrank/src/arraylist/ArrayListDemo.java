package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		ArrayList[] al = new ArrayList[20000];

		int n = sc1.nextInt();

		for (int i = 0; i < n; i++) {
			al[i] = new ArrayList();
			int d = sc1.nextInt();

			for (int j = 0; j < d; j++) {
				int value = sc1.nextInt();
				al[i].add(value);

			}

		}

		
		int queries=sc1.nextInt();
		for(int k=0;k<queries;k++) {
			int x=sc1.nextInt();
			int y=sc1.nextInt();
			
		try {
			System.out.println(al[x-1].get(y-1));
		}catch (Exception e) {
			// TODO: handle exception
		System.out.println("ERROE!");
		}
		}
	}

}
