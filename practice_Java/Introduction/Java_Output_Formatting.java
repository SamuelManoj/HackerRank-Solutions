package practice_Java.Introduction;

import java.util.Scanner;

public class Java_Output_Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			System.out.printf("%-15s%03d%n", s1, x);
		}
		sc.close();
		System.out.println("================================");

	}

}
