package practice_Java.Introduction;

import java.util.Scanner;

public class Java_IfElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (N % 2 != 0 || (N >= 6 && N <= 20)) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}
		scanner.close();
	}
}
