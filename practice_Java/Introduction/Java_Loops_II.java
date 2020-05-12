package practice_Java.Introduction;

import java.util.Scanner;

public class Java_Loops_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 0; j < n; j++) {
				a = a + (int) Math.pow(2, j) * b;
				System.out.printf("%d", a);
				System.out.printf(" ");
			}
			System.out.println();
		}
		in.close();

	}

}
